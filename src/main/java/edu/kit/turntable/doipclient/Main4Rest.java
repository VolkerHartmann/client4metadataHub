/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kit.turntable.doipclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import edu.kit.datacite.kernel_4.Datacite43Schema;
import edu.kit.datacite.kernel_4.RelatedIdentifier;
import edu.kit.datacite.kernel_4.Title;
import edu.kit.metadatahub.doip.rest.Content;
import edu.kit.metadatahub.doip.rest.Operations;
import edu.kit.metadatahub.doip.rest.RestDoip;
import edu.kit.rest.util.SimpleServiceClient;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;
import net.dona.doip.DoipConstants;
import net.dona.doip.client.AuthenticationInfo;
import net.dona.doip.client.DigitalObject;
import net.dona.doip.client.DoipException;
import net.dona.doip.client.Element;
import net.dona.doip.client.TokenAuthenticationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

/**
 *
 * @author hartmann-v
 */
public class Main4Rest {

  /**
   * Logger.
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(Main4Rest.class);

  private static String baseUrl = "http://localhost:8099/doip";
  private static String acceptType = "application/json";

  /**
   * JSON schema which should be registered.
   */
  private final static String JSON_SCHEMA = "{\n"
          + "    \"$schema\": \"http://json-schema.org/draft/2019-09/schema#\",\n"
          + "    \"$id\": \"http://www.example.org/schema/json\",\n"
          + "    \"type\": \"object\",\n"
          + "    \"title\": \"Json schema for tests\",\n"
          + "    \"default\": {},\n"
          + "    \"required\": [\n"
          + "        \"title\",\n"
          + "        \"date\"\n"
          + "    ],\n"
          + "    \"properties\": {\n"
          + "        \"title\": {\n"
          + "            \"$id\": \"#/properties/string\",\n"
          + "            \"type\": \"string\",\n"
          + "            \"title\": \"Title\",\n"
          + "            \"description\": \"Title of object.\"\n"
          + "        },\n"
          + "        \"date\": {\n"
          + "            \"$id\": \"#/properties/string\",\n"
          + "            \"type\": \"string\",\n"
          + "            \"format\": \"date\",\n"
          + "            \"title\": \"Date\",\n"
          + "            \"description\": \"Date of object\"\n"
          + "        }\n"
          + "    },\n"
          + "    \"additionalProperties\": false\n"
          + "}";
  /**
   * Second version of schema for updating schema.
   */
  private final static String JSON_SCHEMA_V2 = "{\n"
          + "    \"$schema\": \"http://json-schema.org/draft/2019-09/schema#\",\n"
          + "    \"$id\": \"http://www.example.org/schema/json\",\n"
          + "    \"type\": \"object\",\n"
          + "    \"title\": \"Json schema for tests\",\n"
          + "    \"default\": {},\n"
          + "    \"required\": [\n"
          + "        \"title\",\n"
          + "        \"date\"\n"
          + "    ],\n"
          + "    \"properties\": {\n"
          + "        \"title\": {\n"
          + "            \"$id\": \"#/properties/string\",\n"
          + "            \"type\": \"string\",\n"
          + "            \"title\": \"Title\",\n"
          + "            \"description\": \"Title of object.\"\n"
          + "        },\n"
          + "        \"date\": {\n"
          + "            \"$id\": \"#/properties/string\",\n"
          + "            \"type\": \"string\",\n"
          + "            \"format\": \"date\",\n"
          + "            \"title\": \"Date\",\n"
          + "            \"description\": \"Date of object\"\n"
          + "        },\n"
          + "        \"note\": {\n"
          + "            \"$id\": \"#/properties/string\",\n"
          + "            \"type\": \"string\",\n"
          + "            \"title\": \"Note\",\n"
          + "            \"description\": \"Additonal information about object.\"\n"
          + "        }\n"
          + "    },\n"
          + "    \"additionalProperties\": false\n"
          + "}";

  /**
   * JSON schema which should be registered.
   */
  private final static String JSON_DOCUMENT = "{\n"
          + "        \"title\": \"Title\",\n"
          + "        \"date\": \"2022-04-25\"\n"
          + "}";
  /**
   * Second version of schema for updating schema.
   */
  private final static String JSON_DOCUMENT_V2 = "{\n"
          + "        \"title\": \"Title\",\n"
          + "        \"date\": \"2022-04-25\",\n"
          + "        \"note\": \"Any note here\"\n"
          + "}";

  private static final String COSCINE_METADATA_V1 = "{\n"
          + "\"http://purl.org/dc/terms/creator\": [{\n"
          + "\"value\": \"Volker Hartmann via turntable dockerized version\",\n"
          + "\"type\": \"literal\",\n"
          + "      \"datatype\": \"http://www.w3.org/2001/XMLSchema#string\"\n"
          + "    }],\n"
          + "  \"http://purl.org/dc/terms/title\": [{\n"
          + "      \"value\": \"Test with dockerized turntable!\",\n"
          + "      \"type\": \"literal\",\n"
          + "      \"datatype\": \"http://www.w3.org/2001/XMLSchema#string\"\n"
          + "    }],\n"
          + "  \"http://purl.org/dc/terms/created\": [{\n"
          + "      \"value\": \"2022-06-28\",\n"
          + "      \"type\": \"literal\",\n"
          + "      \"datatype\": \"http://www.w3.org/2001/XMLSchema#date\"\n"
          + "    }]\n"
          + "}\n";

  private static final String COSCINE_METADATA_V2 = "{\n"
          + "\"http://purl.org/dc/terms/creator\": [{\n"
          + "\"value\": \"Final test for updating creator with docker\",\n"
          + "\"type\": \"literal\",\n"
          + "      \"datatype\": \"http://www.w3.org/2001/XMLSchema#string\"\n"
          + "    }],\n"
          + "  \"http://purl.org/dc/terms/title\": [{\n"
          + "      \"value\": \"Final test update with dockerized turntable!\",\n"
          + "      \"type\": \"literal\",\n"
          + "      \"datatype\": \"http://www.w3.org/2001/XMLSchema#string\"\n"
          + "    }],\n"
          + "  \"http://purl.org/dc/terms/created\": [{\n"
          + "      \"value\": \"2022-06-28\",\n"
          + "      \"type\": \"literal\",\n"
          + "      \"datatype\": \"http://www.w3.org/2001/XMLSchema#date\"\n"
          + "    }]\n"
          + "}\n";

  /**
   * @param args the command line arguments
   * @throws java.io.IOException
   * @throws net.dona.doip.client.DoipException
   */
  public static void main(String[] args) throws IOException, DoipException {
    // These values should be copied from DOIP configuration.
    String TARGET_ONE = "35.TEST/DOIPServer";
    int PORT = 8880;
    String bearerToken = null;
    // Flag for skipping tests for mapping
    boolean skip;
    List<String> listOperations = new ArrayList<>();
    RestDoip result = null;
    String id = "anyId";
    String schemaId = null;
    String eTag = "anyETag";
    InputStream element = null;
    JsonReader reader;

    System.out.println("Reading token from " + args[0]);
    if (args.length > 0) {
      // Read bearer token from file...
      InputStream inputStream = null;
      try {
        File file = new File(args[0]);
        inputStream = new FileInputStream(file);

        try ( BufferedReader br
                = new BufferedReader(new InputStreamReader(inputStream))) {
          String line;
          line = br.readLine();
          bearerToken = /*"bearer " + */ line;
        }
      } catch (IOException ioe) {
        System.out.println("Error reading " + args[0]);
        bearerToken = "anInvalidToken";
      } finally {
        if (inputStream != null) {
          try {
            inputStream.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    }
//    String TARGET_TWO = "36.TEST/DOIPServer";
    // TODO code application logic here
//    DoipClient client = new DoipClient();
    DigitalObject dobj;
    RestDoip restDoip = null;
    //   ServiceInfo serviceInfo = new ServiceInfo(TARGET_ONE, "localhost", PORT); //nfdi4ing.datamanager.kit.edu", PORT);
    // Configure JSON parser for config file
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    AuthenticationInfo authInfo; // authInfo = new PasswordAuthenticationInfo("admin", "password");
    /////////////////////////////////////////////////////////////////////////////
    // To disable a server put a '!' in front of the client ID
    // e.g. 
    // String[] allClientIds = {"!metastore_Schema_ID", "!coscine_Schema_ID", "!metastore_metadata_ID", "coscine_Metadata_ID"};
    // to allow only coscine metadata server.
    /////////////////////////////////////////////////////////////////////////////
    String[] allClientIds = {"!metastore_Schema_ID", "coscine_Schema_ID", "!metastore_metadata_ID", "coscine_Metadata_ID"};
    listOperations.add(DoipConstants.OP_CREATE);
    listOperations.add(DoipConstants.OP_RETRIEVE);
    listOperations.add(DoipConstants.OP_UPDATE);
    listOperations.add(DoipConstants.OP_SEARCH);
    String clientId = allClientIds[0];
    skip = false;
    if (clientId.startsWith("!")) {
      clientId = clientId.substring(1);
      skip = true;
      printHeader("Skip tests for " + clientId);
    }
    authInfo = new TokenAuthenticationInfo(clientId, "myPersonalToken");
//    authInfo = null;
    if (!skip) {
      printHeader("HELLO " + clientId);

// Hello not available via REST
//      result = client.hello(TARGET_ONE, authInfo, serviceInfo);
//      printResult(result);
// List operations not available via REST
//      // Request 0.DOIP/Op.ListOperations
//      printHeader("LIST_OPERATIONS");
//      listOperations = client.listOperations(TARGET_ONE, authInfo, serviceInfo);
//      System.out.println(listOperations);
      // Request 0.DOIP/Op.Create
      if (listOperations.contains(DoipConstants.OP_CREATE)) {
        printHeader("Create...");
        dobj = createSchema();
        restDoip = toRestDoip(dobj, clientId, "noToken");

        result = serveRest(restDoip, Operations.OP_CREATE);
        printResult(result);
        id = result.getId();
        schemaId = id;
        // Fetch also ETag from header
        for (Content headerElement : result.getHeader()) {
          if (headerElement.getId().equalsIgnoreCase("ETag")) {
            eTag = headerElement.getValue();
            printHeader("ETag: " + eTag);
          }
        }
      } else {
        printHeader("Skip Create...");
      }
      if (listOperations.contains(DoipConstants.OP_RETRIEVE)) {
        // Request 0.DOIP/Op.Retrieve
        printHeader("Retrieve without elements!");

        Datacite43Schema datacite = new Datacite43Schema();
        restDoip = toEmptyRestDoip(datacite, clientId, "noToken");
        restDoip.setTargetId(schemaId);
        result = serveRest(restDoip, Operations.OP_RETRIEVE);
        printResult(result);

        printHeader("Retrieve metadata element!");
        Content content = new Content();
        content.setId("metadata");
        content.setValue("Any value");
        restDoip.getElements().add(content);

        result = serveRest(restDoip, Operations.OP_RETRIEVE);
        printResult(result);

        printHeader("Retrieve metadata and schema elements!");
        content = new Content();
        content.setId("schema");
        content.setValue("Any value");
        restDoip.getElements().add(content);

        result = serveRest(restDoip, Operations.OP_RETRIEVE);
        printResult(result);

      } else {
        printHeader("Skip Retrieve...");
      }
      if (listOperations.contains(DoipConstants.OP_UPDATE)) {
        // Request 0.DOIP/Op.Update
        printHeader("update digital object");
        printHeader("ETag: " + eTag);
        DigitalObject updateSchema = updateSchema(id, eTag);
        restDoip = toRestDoip(updateSchema, clientId, "noToken");
        restDoip.setTargetId(schemaId);
        result = serveRest(restDoip, Operations.OP_UPDATE);
        printResult(result);
      } else {
        printHeader("Skip Update...");
      }
      if (listOperations.contains(DoipConstants.OP_SEARCH)) {
//        // Request 0.DOIP/Op.Update
//        printHeader("Search digital object");
//        DigitalObject updateSchema = updateSchema(id, eTag);
//        String query = "*";
//        SearchResults<DigitalObject> search = client.search(TARGET_ONE, query, null, authInfo, serviceInfo);
//        Iterator<DigitalObject> iterator = search.iterator();
//        printHeader("Search results: ");
//        while (iterator.hasNext()) {
//          printResult(iterator.next());
//        }
      } else {
        printHeader("Skip Search...");

      }
    }
    printHeader("End of test for clientID: " + clientId);

    /**
     * ************************************************************************
     * Test of next clientID (application profiles)
     */
    clientId = allClientIds[1];
    skip = false;
    if (clientId.startsWith("!")) {
      clientId = clientId.substring(1);
      skip = true;
      printHeader("Skip tests for " + clientId);
    }
    authInfo = new TokenAuthenticationInfo(clientId, bearerToken);
//    authInfo = null;

    if (!skip) {
      printHeader("HELLO " + clientId);

// Hello not available via REST
//      result = client.hello(TARGET_ONE, authInfo, serviceInfo);
//      printResult(result);
// List operations not available via REST
//      // Request 0.DOIP/Op.ListOperations
//      printHeader("LIST_OPERATIONS");
//      listOperations = client.listOperations(TARGET_ONE, authInfo, serviceInfo);
//      System.out.println(listOperations);
      // Request 0.DOIP/Op.Create
/////////////////////////////////////////////////////////////////////////
// Skip create for the moment.
/////////////////////////////////////////////////////////////////////////
//      if (listOperations.contains(DoipConstants.OP_CREATE)) {
//        printHeader("Create...");
//        dobj = createSchema();
//        result = client.create(dobj, authInfo, serviceInfo);
//        printResult(result);
//        id = result.id;
//        // Fetch also ETag from header
//        eTag = result.attributes.getAsJsonObject("header").get("ETag").getAsString();
//        printHeader("eTag = " + eTag);
//      } else {
//        printHeader("Skip Create...");
//      }
      if (listOperations.contains(DoipConstants.OP_RETRIEVE)) {
        // Request 0.DOIP/Op.Retrieve

        printHeader("Retrieve metadata element!");
        id = new String("https://purl.org/coscine/ap/radar/");
        Datacite43Schema datacite = new Datacite43Schema();
        restDoip = toEmptyRestDoip(datacite, clientId, bearerToken);
        restDoip.setTargetId(id);
        Content content = new Content();
//        content.setId("metadata");
//        content.setValue("Any value");
//        restDoip.getElements().add(content);
//
//        result = serveRest(restDoip, Operations.OP_RETRIEVE, id);
//        printResult(result);

        printHeader("Retrieve schema element!");
        content = new Content();
        content.setId("schema");
        content.setValue("Any value");
        restDoip.getElements().add(content);

        result = serveRest(restDoip, Operations.OP_RETRIEVE);
        printResult(result);
      } else {
        printHeader("Skip Retrieve...");
      }
      if (listOperations.contains(DoipConstants.OP_UPDATE)) {
        printHeader("Skip update digital object");
//        // Request 0.DOIP/Op.Update
//        printHeader("Update digital object");
//        DigitalObject updateSchema = updateSchema(id, eTag);
//        restDoip = toRestDoip(updateSchema, clientId, "noToken");
//        restDoip.setTargetId(schemaId);
//        result = serveRest(restDoip, Operations.OP_UPDATE);
////    result = client.update(updateSchema, authInfo, serviceInfo);
//        printResult(result);
      } else {
        printHeader("Skip Update...");

      }
      if (listOperations.contains(DoipConstants.OP_SEARCH)) {
//        // Request 0.DOIP/Op.Update
//        printHeader("Search digital object");
//        DigitalObject updateSchema = updateSchema(id, eTag);
//        String query = "*";
//        SearchResults<DigitalObject> search = client.search(TARGET_ONE, query, null, authInfo, serviceInfo);
//        Iterator<DigitalObject> iterator = search.iterator();
//        printHeader("Search results: ");
//        while (iterator.hasNext()) {
//          printResult(iterator.next());
//        }
      } else {
        printHeader("Skip Search...");

      }
    }
    printHeader("End of test for clientID: " + clientId);

    /**
     * ************************************************************************
     * Test of next clientID (Metadata Documents 4 MetaStore)
     */
    clientId = allClientIds[2];
    skip = false;

    if (clientId.startsWith("!")) {
      clientId = clientId.substring(1);
      skip = true;
      printHeader("Skip tests for " + clientId);
    }
    authInfo = new TokenAuthenticationInfo(clientId, "myPersonalToken");
//    authInfo = null;

    if (!skip) {
      printHeader("HELLO " + clientId);
// Hello not available via REST
//      result = client.hello(TARGET_ONE, authInfo, serviceInfo);
//      printResult(result);
// List operations not available via REST
//      // Request 0.DOIP/Op.ListOperations
//      printHeader("LIST_OPERATIONS");
//      listOperations = client.listOperations(TARGET_ONE, authInfo, serviceInfo);
//      System.out.println(listOperations);
      // Request 0.DOIP/Op.Create
      if (listOperations.contains(DoipConstants.OP_CREATE)) {
        printHeader("Create...");
        dobj = createMetadataDocument(schemaId);
        restDoip = toRestDoip(dobj, clientId, "noToken");
        result = serveRest(restDoip, Operations.OP_CREATE);
        printResult(result);
        id = result.getId();
        // Fetch also ETag from header
        for (Content headerElement : result.getHeader()) {
          if (headerElement.getId().equalsIgnoreCase("ETag")) {
            eTag = headerElement.getValue();
            printHeader("ETag: " + eTag);
          }
        }
        printHeader("eTag = " + eTag);
      } else {
        printHeader("Skip Create...");
      }
      if (listOperations.contains(DoipConstants.OP_RETRIEVE)) {
        // Request 0.DOIP/Op.Retrieve
        printHeader("Retrieve without elements!");

        Datacite43Schema datacite = new Datacite43Schema();
        restDoip = toEmptyRestDoip(datacite, clientId, "noToken");
        restDoip.setTargetId(id);
        result = serveRest(restDoip, Operations.OP_RETRIEVE);
        printResult(result);

        printHeader("Retrieve metadata element!");
        Content content = new Content();
        content.setId("metadata");
        content.setValue("Any value");
        restDoip.getElements().add(content);

        result = serveRest(restDoip, Operations.OP_RETRIEVE);
        printResult(result);

        printHeader("Retrieve metadata and schema elements!");
        content = new Content();
        content.setId("document");
        content.setValue("Any value");
        restDoip.getElements().add(content);

        result = serveRest(restDoip, Operations.OP_RETRIEVE);
        printResult(result);

      } else {
        printHeader("Skip Retrieve...");
      }
      if (listOperations.contains(DoipConstants.OP_UPDATE)) {
        // Request 0.DOIP/Op.Update
        printHeader("update digital object");
        DigitalObject updateSchema = updateMetadataDocument(id, schemaId, eTag);
        updateSchema.id = id;
        restDoip = toRestDoip(updateSchema, clientId, "noToken");
        restDoip.setTargetId(id);
        result = serveRest(restDoip, Operations.OP_UPDATE);
        printResult(result);
      } else {
        printHeader("Skip Update...");
      }
      if (listOperations.contains(DoipConstants.OP_SEARCH)) {
//        // Request 0.DOIP/Op.Update
//        printHeader("Search digital object");
//        DigitalObject updateSchema = updateSchema(id, eTag);
//        String query = "*";
//        SearchResults<DigitalObject> search = client.search(TARGET_ONE, query, null, authInfo, serviceInfo);
//        Iterator<DigitalObject> iterator = search.iterator();
//        printHeader("Search results: ");
//        while (iterator.hasNext()) {
//          printResult(iterator.next());
//        }
      } else {
        printHeader("Skip Search...");

      }
      printHeader("End of test for clientID: " + clientId);
    }
    /**
     * ************************************************************************
     * Test of next clientID (Metadata Documents 4 Coscine)
     */
    clientId = allClientIds[3];
    skip = false;
    if (clientId.startsWith("!")) {
      clientId = clientId.substring(1);
      skip = true;
      printHeader("Skip tests for " + clientId);
    }
    authInfo = new TokenAuthenticationInfo(clientId, bearerToken);
//    authInfo = null;

    if (!skip) {
      printHeader("HELLO " + clientId);

      // Hello not available via REST
//     result = client.hello(TARGET_ONE, authInfo, serviceInfo);
//      printResult(result);
//List operations not available via REST
//      // Request 0.DOIP/Op.ListOperations
//      printHeader("LIST_OPERATIONS");
//      listOperations = client.listOperations(TARGET_ONE, authInfo, serviceInfo);
//      System.out.println(listOperations);
      SimpleDateFormat sdf
              = new SimpleDateFormat("-yyyy-MM-dd-HH-mm");
      id = "62b97a86-d3cf-4517-9b09-6a09cd9b476d";
      id = "21.11102/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path=/newfile.txt";
      id = "21.11102/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path=/coscine.txt";
      id = "21.11102/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path=/final_test_doip_mapping.txt" + sdf.format(new Date());
      id = "21.11192/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path=/turntableRestTest.txt";
//      id = "62b97a86-d3cf-4517-9b09-6a09cd9b476d?path=/coscine_upload.txt";
      element = null;
      reader = null;
      // Request 0.DOIP/Op.Create
//      if (listOperations.contains(DoipConstants.OP_CREATE)) {
//        printHeader("Create...");
//        dobj = createMetadataDocument4Coscine(id);
//        dobj.id = id;
//        restDoip = toRestDoip(dobj, clientId, bearerToken);
//        result = serveRest(restDoip, Operations.OP_CREATE, null);
////      result = client.create(dobj, authInfo, serviceInfo);
//        printResult(result);
////        id = result.id;
//        printHeader("ID = " + id);
//      } else {
//        printHeader("Skip Create...");
//      }
      if (listOperations.contains(DoipConstants.OP_RETRIEVE)) {
        // Request 0.DOIP/Op.Retrieve
//        printHeader("Retrieve without elements!");
        Datacite43Schema datacite = new Datacite43Schema();
        restDoip = toEmptyRestDoip(datacite, clientId, bearerToken);
        restDoip.setId(id);
        result = serveRest(restDoip, Operations.OP_RETRIEVE);
////        result = client.retrieve(id, false, authInfo, serviceInfo);
//        printResult(result);

        printHeader("Retrieve document element!");
        Content content = new Content();
        content.setId("document");
        content.setValue("Any value");
        restDoip.getElements().add(content);
        content = new Content();
        content.setId("digitalObjectId");
        content.setValue(id);
        restDoip.getElements().add(content);
        restDoip.setTargetId(id);

        result = serveRest(restDoip, Operations.OP_RETRIEVE);
//        printHeader("Retrieve all elements!");
//        result = client.retrieve(id, true, authInfo, serviceInfo);
        printResult(result);

//        printHeader("Retrieve metadata and document elements!");
//        content = new Content();
//        content.setId("document");
//        content.setValue("Any value");
//        restDoip.getElements().add(content);
//
//        result = serveRest(restDoip, Operations.OP_RETRIEVE, id);
//        printResult(result);
      } else {
        printHeader("Skip Retrieve...");
      }
      if (listOperations.contains(DoipConstants.OP_UPDATE)) {
        id = "21.11102/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path=/TestTheREST.txt";
        // Request 0.DOIP/Op.Update
        printHeader("update digital object");
        DigitalObject updateSchema = updateMetadataDocument4Coscine(id);
        updateSchema.id = id;
        restDoip = toRestDoip(updateSchema, clientId, bearerToken);
        restDoip.setTargetId(id);
        result = serveRest(restDoip, Operations.OP_UPDATE);
//        result = client.update(updateSchema, authInfo, serviceInfo);
        printResult(result);
      } else {
        printHeader("Skip Update...");
      }
      if (listOperations.contains(DoipConstants.OP_SEARCH)) {
        // Request 0.DOIP/Op.Update
//        printHeader("Search digital object");
//        DigitalObject updateSchema = updateSchema(id, eTag);
//        String query = "*";
//        SearchResults<DigitalObject> search = client.search(TARGET_ONE, query, null, authInfo, serviceInfo);
//        Iterator<DigitalObject> iterator = search.iterator();
//        printHeader("Search results: ");
//        while (iterator.hasNext()) {
//          printResult(iterator.next());
//        }
      } else {
        printHeader("Skip Search...");

      }

      printHeader("End of test for clientID: " + clientId);
    }

    System.exit(0);

  }

  private static DigitalObject createSchema() throws IOException {
    Datacite43Schema datacite = new Datacite43Schema();
    SimpleDateFormat sdf = new SimpleDateFormat("_yyyy_MM_dd_HH_mm");
    Title title = new Title();
    title.setTitle("schema" + sdf.format(new Date()));
    title.setTitleType(Title.TitleType.OTHER);
    datacite.getTitles().add(title);
    datacite.setPublisher("NFDI4Ing");
    datacite.getFormats().add("JSON");//application/json");
    String json = new Gson().toJson(datacite);
    DigitalObject dobj = new DigitalObject();
    dobj.attributes = new JsonObject();
    dobj.attributes.addProperty("datacite", json);
    dobj.elements = new ArrayList<>();
    Element element = new Element();
    element.id = "schema";
    element.type = "application/json";
    element.in = new ByteArrayInputStream(JSON_SCHEMA.getBytes());
    element.length = (long) JSON_SCHEMA.getBytes().length;
    dobj.elements.add(element);

    return dobj;
  }

  private static DigitalObject updateSchema(String id, String eTag) throws IOException {
    DigitalObject dobj;
    Datacite43Schema datacite = new Datacite43Schema();
    Title title = new Title();
    title.setTitle(id);
    title.setTitleType(Title.TitleType.OTHER);
    datacite.getTitles().add(title);
    datacite.setPublisher("NFDI4Ing");
    datacite.getFormats().add("JSON");//application/json");
    String json = new Gson().toJson(datacite);
    dobj = new DigitalObject();
    dobj.id = id;
    dobj.attributes = new JsonObject();
    dobj.attributes.addProperty("datacite", json);
    JsonObject header = new JsonObject();
    header.addProperty("If-Match", eTag);
    dobj.attributes.add("header", header);
    dobj.elements = new ArrayList<>();
    Element element = new Element();
    element.id = "schema";
    element.type = "application/json";
    element.in = new ByteArrayInputStream(JSON_SCHEMA_V2.getBytes());
    element.length = (long) JSON_SCHEMA_V2.getBytes().length;
    dobj.elements.add(element);

    return dobj;
  }

  private static DigitalObject createMetadataDocument(String schemaId) throws IOException {
    Datacite43Schema datacite = new Datacite43Schema();
    SimpleDateFormat sdf = new SimpleDateFormat("_yyyy_MM_dd_HH_mm");
    Title title = new Title();
    title.setTitle("document" + sdf.format(new Date()));
    title.setTitleType(Title.TitleType.OTHER);
    datacite.getTitles().add(title);
    datacite.setPublisher("NFDI4Ing");

    RelatedIdentifier relId = new RelatedIdentifier();
    relId.setRelatedIdentifier("http://example.org/relatedResource");
    relId.setRelatedIdentifierType(RelatedIdentifier.RelatedIdentifierType.URL);
    relId.setRelationType(RelatedIdentifier.RelationType.IS_METADATA_FOR);
    datacite.getRelatedIdentifiers().add(relId);

    relId = new RelatedIdentifier();
    relId.setRelatedIdentifier("http://localhost:8040/api/v1/schemas/" + schemaId);
    relId.setRelatedIdentifierType(RelatedIdentifier.RelatedIdentifierType.URL);
    relId.setRelationType(RelatedIdentifier.RelationType.IS_DERIVED_FROM);
    datacite.getRelatedIdentifiers().add(relId);

    String json = new Gson().toJson(datacite);
    DigitalObject dobj = new DigitalObject();
    dobj.attributes = new JsonObject();
    dobj.attributes.addProperty("datacite", json);
    dobj.elements = new ArrayList<>();
    Element element = new Element();
    element.id = "document";
    element.type = "application/json";
    element.in = new ByteArrayInputStream(JSON_DOCUMENT.getBytes());
    element.length = (long) JSON_DOCUMENT.getBytes().length;
    dobj.elements.add(element);

    return dobj;
  }

  private static DigitalObject createMetadataDocument4Coscine(String id) throws IOException {
    Datacite43Schema datacite = new Datacite43Schema();
    SimpleDateFormat sdf = new SimpleDateFormat("_yyyy_MM_dd_HH_mm");
    Title title = new Title();
    title.setTitle("document" + sdf.format(new Date()));
    title.setTitleType(Title.TitleType.OTHER);
    datacite.getTitles().add(title);
    datacite.setPublisher("NFDI4Ing");

    String json = new Gson().toJson(datacite);
    DigitalObject dobj = new DigitalObject();
    dobj.attributes = new JsonObject();
    dobj.attributes.addProperty("datacite", json);
    dobj.elements = new ArrayList<>();
    Element element = new Element();
    element.id = "document";
    element.type = "application/json";
    element.in = new ByteArrayInputStream(COSCINE_METADATA_V1.getBytes());
    element.length = (long) COSCINE_METADATA_V1.getBytes().length;
    dobj.elements.add(element);

    element = new Element();
    element.id = "digitalObjectId";
    element.type = "application/text";
    element.in = new ByteArrayInputStream(id.getBytes());
    element.length = (long) id.getBytes().length;
    dobj.elements.add(element);
    return dobj;
  }

  private static DigitalObject updateMetadataDocument(String id, String schemaId, String eTag) throws IOException {
    Datacite43Schema datacite = new Datacite43Schema();
    Title title = new Title();
    title.setTitle(id);
    title.setTitleType(Title.TitleType.OTHER);
    datacite.getTitles().add(title);
    datacite.setPublisher("NFDI4Ing");

    RelatedIdentifier relId = new RelatedIdentifier();
    relId.setRelatedIdentifier("http://example.org/relatedResource");
    relId.setRelatedIdentifierType(RelatedIdentifier.RelatedIdentifierType.URL);
    relId.setRelationType(RelatedIdentifier.RelationType.IS_METADATA_FOR);
    datacite.getRelatedIdentifiers().add(relId);

    relId = new RelatedIdentifier();
    relId.setRelatedIdentifier("http://localhost:8040/api/v1/schemas/" + schemaId);
    relId.setRelatedIdentifierType(RelatedIdentifier.RelatedIdentifierType.URL);
    relId.setRelationType(RelatedIdentifier.RelationType.IS_DERIVED_FROM);
    datacite.getRelatedIdentifiers().add(relId);

    String json = new Gson().toJson(datacite);
    DigitalObject dobj = new DigitalObject();
    // id has to be set
    dobj.id = id;
    dobj.attributes = new JsonObject();
    dobj.attributes.addProperty("datacite", json);
    JsonObject header = new JsonObject();
    header.addProperty("If-Match", eTag);
    dobj.attributes.add("header", header);
    dobj.elements = new ArrayList<>();
    Element element = new Element();
    element.id = "document";
    element.type = "application/json";
    element.in = new ByteArrayInputStream(JSON_DOCUMENT_V2.getBytes());
    element.length = (long) JSON_DOCUMENT_V2.getBytes().length;
    dobj.elements.add(element);

    return dobj;
  }

  private static DigitalObject updateMetadataDocument4Coscine(String id) throws IOException {
    Datacite43Schema datacite = new Datacite43Schema();
    SimpleDateFormat sdf = new SimpleDateFormat("_yyyy_MM_dd_HH_mm");
    Title title = new Title();
    title.setTitle("Final test update document" + sdf.format(new Date()));
    title.setTitleType(Title.TitleType.OTHER);
    datacite.getTitles().add(title);
    datacite.setPublisher("NFDI4Ing");

    String json = new Gson().toJson(datacite);
    DigitalObject dobj = new DigitalObject();
    dobj.id = id;
    dobj.attributes = new JsonObject();
    dobj.attributes.addProperty("datacite", json);
    dobj.elements = new ArrayList<>();
    Element element = new Element();
    element.id = "document";
    element.type = "application/json";
    element.in = new ByteArrayInputStream(COSCINE_METADATA_V2.getBytes());
    element.length = (long) COSCINE_METADATA_V2.getBytes().length;
    dobj.elements.add(element);

    return dobj;
  }

  private static void printHeader(String header) {
    System.out.println("********************************************************************");
    System.out.println("***" + header);
    System.out.println("********************************************************************");

  }

  private static void printResult(DigitalObject result) throws IOException {
    System.out.println(result.id);
    System.out.println(result.type);
    System.out.println(result.attributes);
    if (result.elements != null) {
      System.out.println("No of elements: " + result.elements.size());
      for (Element item : result.elements) {
        System.out.println("Element...");
        System.out.println(item.id);
        System.out.println(item.attributes);
        System.out.println(item.type);
        System.out.println(item.length);
        printResult(item.in);
      }
    }
  }

  private static RestDoip toRestDoip(DigitalObject digitalObject, String clientId, String token) throws JsonProcessingException {
    RestDoip returnValue = new RestDoip();
    returnValue.setClientId(clientId);
    returnValue.setToken(token);
    if (digitalObject.attributes != null && !digitalObject.attributes.isJsonNull()) {
      if (digitalObject.attributes.get("datacite") != null && !digitalObject.attributes.get("datacite").isJsonNull()) {
        String dataciteString = digitalObject.attributes.get("datacite").getAsString();
        String before = dataciteString;
        for (RelatedIdentifier.RelationType type : RelatedIdentifier.RelationType.values()) {
          dataciteString = dataciteString.replace(addQuotes(type.value()), addQuotes(type.name()));
        }
        for (RelatedIdentifier.RelatedIdentifierType type : RelatedIdentifier.RelatedIdentifierType.values()) {
          dataciteString = dataciteString.replace(addQuotes(type.value()), addQuotes(type.name()));
        }
        ObjectMapper mapper = new ObjectMapper();
        printHeader("Datacite: \n" + dataciteString);
        Datacite43Schema datacite = mapper.readValue(dataciteString, Datacite43Schema.class
        );
        returnValue.setDatacite(datacite);
      }
      if (digitalObject.attributes.get("header") != null && !digitalObject.attributes.get("header").isJsonNull()) {
        List<Content> headerElements = new ArrayList<>();

        for (String key : digitalObject.attributes.get("header").getAsJsonObject().keySet()) {
          Content newContent = new Content();
          newContent.setId(key);
          newContent.setValue(digitalObject.attributes.get("header").getAsJsonObject().get(key).getAsString());
          headerElements.add(newContent);
          printHeader("Header: " + key + ": " + newContent.getValue());
        }
        returnValue.setHeader(headerElements);
      }
    }

    if (digitalObject.elements != null && !digitalObject.elements.isEmpty()) {
      List<Content> elements = new ArrayList<>();
      for (Element element : digitalObject.elements) {
        Content newContent = new Content();
        newContent.setId(element.id);
        newContent.setType(element.type);
        String text = new BufferedReader(
                new InputStreamReader(element.in, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining("\n"));
        newContent.setValue(text);
        elements.add(newContent);
      }
      returnValue.setElements(elements);
    }

    return returnValue;
  }

  private static RestDoip toEmptyRestDoip(Datacite43Schema datacite, String clientId, String token) throws JsonProcessingException {
    RestDoip returnValue = new RestDoip();
    returnValue.setClientId(clientId);
    returnValue.setToken(token);

    // DataCite
    returnValue.setDatacite(datacite);

    // header
    List<Content> headerElements = new ArrayList<>();
    returnValue.setHeader(headerElements);

    List<Content> elements = new ArrayList<>();
    returnValue.setElements(elements);

    return returnValue;
  }

  private static void printResult(RestDoip result) throws IOException {
    System.out.println("RESULT via REST!");
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    System.out.println(gson.toJson(result));
  }

  private static void printResult(InputStream inputStream) throws IOException {
    StringBuilder textBuilder = new StringBuilder("stream: '");
    if (inputStream != null) {
      char[] input = new char[8196];
      System.out.println("Inputstream not null");
      try ( Reader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
        int c = 0;
        while ((c = reader.read(input)) > 0) {
          System.out.println("Read '" + c + "' bytes!");
          textBuilder.append(new String(input, 0, c));
        }
      }
    }
    textBuilder.append("'");
    System.out.println(textBuilder.toString());
  }

  private static RestDoip serveRest(RestDoip input, Operations operation) {

    SimpleServiceClient simpleClient = SimpleServiceClient.create(baseUrl + "?operationId=" + operation.name());
    simpleClient.accept(MediaType.parseMediaType(acceptType));
    ObjectMapper mapper = new ObjectMapper();
    String jsonStr = "null";
    RestDoip result = null;

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    jsonStr = gson.toJson(input);

    System.out.println("**************************************");
    System.out.println("****REST4DOIP*************************");
    System.out.println("**************************************");
    System.out.println("Operation ID: " + operation.name());
    System.out.println("JSON4DOIP   :");
    System.out.println(jsonStr);
    System.out.println("**************************************");
    System.out.println("**************************************");
    System.out.println("**************************************");
    for (RelatedIdentifier.RelationType type : RelatedIdentifier.RelationType.values()) {
      jsonStr = jsonStr.replace(addQuotes(type.value()), addQuotes(type.name()));
    }
    for (RelatedIdentifier.RelatedIdentifierType type : RelatedIdentifier.RelatedIdentifierType.values()) {
      jsonStr = jsonStr.replace(addQuotes(type.value()), addQuotes(type.name()));

    }

//      String returnValue = simpleClient.postResource(jsonStr, String.class);
//      result = mapper.readValue(returnValue, RestDoip.class);
    result = simpleClient.postResource(input, RestDoip.class);
    return result;
  }

  /**
   * Add quotes to a string to avoid partly replacement for values inside a json
   * document.
   *
   * @param value value without quotes.
   * @return value with quotes.
   */
  private static String addQuotes(String value) {
    String returnValue = value;
    String quote = "\"";
    if (!value.startsWith(quote) && !value.endsWith(quote)) {
      returnValue = quote + value + quote;
    }
    return returnValue;
  }
}
