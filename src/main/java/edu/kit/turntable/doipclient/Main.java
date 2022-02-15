/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kit.turntable.doipclient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import edu.kit.datacite.kernel_4.Datacite43Schema;
import edu.kit.datacite.kernel_4.Title;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.dona.doip.client.AuthenticationInfo;
import net.dona.doip.client.DigitalObject;
import net.dona.doip.client.DoipClient;
import net.dona.doip.client.DoipException;
import net.dona.doip.client.Element;
import net.dona.doip.client.PasswordAuthenticationInfo;
import net.dona.doip.client.ServiceInfo;
import net.dona.doip.client.TokenAuthenticationInfo;

/**
 *
 * @author hartmann-v
 */
public class Main {

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
   * @param args the command line arguments
   */
  public static void main(String[] args) throws IOException, DoipException {
    // These values should be copied from DOIP configuration.
    String TARGET_ONE = "35.TEST/DOIPServer";
    int PORT = 8880;
//    String TARGET_TWO = "36.TEST/DOIPServer";
    // TODO code application logic here
    DoipClient client = new DoipClient();
    DigitalObject dobj;

    // authInfo = new PasswordAuthenticationInfo("admin", "password");
    AuthenticationInfo authInfo = new TokenAuthenticationInfo("metastore_ID", "myPersonalToken");
    ServiceInfo serviceInfo = new ServiceInfo(TARGET_ONE, "localhost", PORT);
    // Configure JSON parser for config file
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    // Request 0.DOIP/Op.Hello
    printHeader("HELLO");
    DigitalObject result = client.hello(TARGET_ONE, authInfo, serviceInfo);
    printResult(result);

    // Request 0.DOIP/Op.ListOperations
    printHeader("LIST_OPERATIONS");
    List<String> listOperations = client.listOperations(TARGET_ONE, authInfo, serviceInfo);
    System.out.println(listOperations);

    // Request 0.DOIP/Op.Create
    printHeader("Create...");
    dobj = createSchema();
    result = client.create(dobj, authInfo, serviceInfo);
    printResult(result);
    String id = result.id;
    // Fetch also ETag from header
    String eTag = result.attributes.getAsJsonObject("header").get("ETag").getAsString();
    printHeader("eTag = " + eTag);

    // Request 0.DOIP/Op.Retrieve
    printHeader("Retrieve without elements!");
    result = client.retrieve(id, false, authInfo, serviceInfo);
    printResult(result);

    printHeader("Retrieve all elements!");
    result = client.retrieve(id, true, authInfo, serviceInfo);
    printResult(result);

    printHeader("Retrieve one element!");
    InputStream element = client.retrieveElement(id, "schema", authInfo, serviceInfo);
    printResult(element);

    printHeader("Retrieve metadata element!");
    element = client.retrieveElement(id, "metadata", authInfo, serviceInfo);
    printResult(element);
    printHeader("Retrieve wrong element!");
    element = client.retrieveElement(id, "invalidElement", authInfo, serviceInfo);
    JsonReader reader = new JsonReader(new InputStreamReader(element));
    result = gson.fromJson(reader, DigitalObject.class);
    printResult(result);

    // Request 0.DOIP/Op.Update
    printHeader("update digital object");
    DigitalObject updateSchema = updateSchema(id, eTag);
    result = client.update(updateSchema, authInfo, serviceInfo);
    printResult(result);
    
    System.exit(0);

  }

  private static DigitalObject createSchema() throws IOException {
    Datacite43Schema datacite = new Datacite43Schema();
    SimpleDateFormat sdf = new SimpleDateFormat("_yyyy_MM_dd_HH_mm");
    Title title = new Title();
    title.setTitle("schema" + sdf.format(new Date()));
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

}
