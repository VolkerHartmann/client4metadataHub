# Documentation of REST API for Metadata Hub

:NOTE: Metastore also provide tokens.
For simplification no token is used in this example.

<details>

## ClientId: metastore_Schema_ID
### Create Digital Object
Operation ID: OP_CREATE
Body   :
{
  "clientId": "metastore_Schema_ID",
  "token": "noToken",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [
      {
        "title": "schema_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "publisher": "NFDI4Ing",
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [
      "JSON"
    ],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "schema",
      "type": "application/json",
      "value": "{\n    \"$schema\": \"http://json-schema.org/draft/2019-09/schema#\",\n    \"$id\": \"http://www.example.org/schema/json\",\n    \"type\": \"object\",\n    \"title\": \"Json schema for tests\",\n    \"default\": {},\n    \"required\": [\n        \"title\",\n        \"date\"\n    ],\n    \"properties\": {\n        \"title\": {\n            \"$id\": \"#/properties/string\",\n            \"type\": \"string\",\n            \"title\": \"Title\",\n            \"description\": \"Title of object.\"\n        },\n        \"date\": {\n            \"$id\": \"#/properties/string\",\n            \"type\": \"string\",\n            \"format\": \"date\",\n            \"title\": \"Date\",\n            \"description\": \"Date of object\"\n        }\n    },\n    \"additionalProperties\": false\n}"
    }
  ],
  "header": []
}
#### Return
{
  "id": "schema_2022_08_30_13_35",
  "datacite": {
    "identifiers": [
      {
        "identifier": "schema_2022_08_30_13_35",
        "identifierType": "Handle",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "identifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35?version\u003d1",
        "identifierType": "URL",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "creators": [],
    "titles": [
      {
        "title": "schema_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "subjects": [],
    "contributors": [],
    "dates": [
      {
        "date": "Tue Aug 30 13:35:23 CEST 2022",
        "dateType": "CREATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "date": "Tue Aug 30 13:35:23 CEST 2022",
        "dateType": "UPDATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [
      "JSON"
    ],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [],
  "header": [
    {
      "id": "ETag",
      "value": "\"-191631817\""
    }
  ]
}

Remark: ETag is needed for updates.


### Get Digital Object (metadata)
Operation ID: OP_RETRIEVE
Body   :
{
  "clientId": "metastore_Schema_ID",
  "targetId": "schema_2022_08_30_13_35",
  "token": "noToken",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [],
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {}
  },
  "attributes": [],
  "elements": [
    {
      "id": "metadata",
      "value": "Any value"
    }
  ],
  "header": []
}
#### Return
{
  "id": "schema_2022_08_30_13_35",
  "datacite": {
    "identifiers": [
      {
        "identifier": "schema_2022_08_30_13_35",
        "identifierType": "Handle",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "identifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35?version\u003d1",
        "identifierType": "URL",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "creators": [],
    "titles": [
      {
        "title": "schema_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "subjects": [],
    "contributors": [],
    "dates": [
      {
        "date": "Tue Aug 30 13:35:23 CEST 2022",
        "dateType": "CREATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "date": "Tue Aug 30 13:35:23 CEST 2022",
        "dateType": "UPDATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [
      "JSON"
    ],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "metadata",
      "value": "{\"identifiers\":[{\"identifier\":\"schema_2022_08_30_13_35\",\"identifierType\":\"Handle\",\"additionalProperties\":{}},{\"identifier\":\"http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35?version\u003d1\",\"identifierType\":\"URL\",\"additionalProperties\":{}}],\"creators\":[],\"titles\":[{\"title\":\"schema_2022_08_30_13_35\",\"titleType\":\"OTHER\",\"additionalProperties\":{}}],\"subjects\":[],\"contributors\":[],\"dates\":[{\"date\":\"Tue Aug 30 13:35:23 CEST 2022\",\"dateType\":\"CREATED\",\"additionalProperties\":{}},{\"date\":\"Tue Aug 30 13:35:23 CEST 2022\",\"dateType\":\"UPDATED\",\"additionalProperties\":{}}],\"alternateIdentifiers\":[],\"relatedIdentifiers\":[],\"sizes\":[],\"formats\":[\"JSON\"],\"rightsList\":[],\"descriptions\":[],\"geoLocations\":[],\"fundingReferences\":[],\"additionalProperties\":{}}"
    }
  ],
  "header": [
    {
      "id": "ETag",
      "value": "\"-191631817\""
    }
  ]
}
### Get Digital Object (metadata & schema)
Operation ID: OP_RETRIEVE
Body   :
{
  "clientId": "metastore_Schema_ID",
  "targetId": "schema_2022_08_30_13_35",
  "token": "noToken",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [],
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {}
  },
  "attributes": [],
  "elements": [
    {
      "id": "metadata",
      "value": "Any value"
    },
    {
      "id": "schema",
      "value": "Any value"
    }
  ],
  "header": []
}
#### Return
{
  "id": "schema_2022_08_30_13_35",
  "datacite": {
    "identifiers": [
      {
        "identifier": "schema_2022_08_30_13_35",
        "identifierType": "Handle",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "identifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35?version\u003d1",
        "identifierType": "URL",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "creators": [],
    "titles": [
      {
        "title": "schema_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "subjects": [],
    "contributors": [],
    "dates": [
      {
        "date": "Tue Aug 30 13:35:23 CEST 2022",
        "dateType": "CREATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "date": "Tue Aug 30 13:35:23 CEST 2022",
        "dateType": "UPDATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [
      "JSON"
    ],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "schema",
      "value": "{\n    \"$schema\": \"http://json-schema.org/draft/2019-09/schema#\",\n    \"$id\": \"http://www.example.org/schema/json\",\n    \"type\": \"object\",\n    \"title\": \"Json schema for tests\",\n    \"default\": {},\n    \"required\": [\n        \"title\",\n        \"date\"\n    ],\n    \"properties\": {\n        \"title\": {\n            \"$id\": \"#/properties/string\",\n            \"type\": \"string\",\n            \"title\": \"Title\",\n            \"description\": \"Title of object.\"\n        },\n        \"date\": {\n            \"$id\": \"#/properties/string\",\n            \"type\": \"string\",\n            \"format\": \"date\",\n            \"title\": \"Date\",\n            \"description\": \"Date of object\"\n        }\n    },\n    \"additionalProperties\": false\n}"
    },
    {
      "id": "metadata",
      "value": "{\"identifiers\":[{\"identifier\":\"schema_2022_08_30_13_35\",\"identifierType\":\"Handle\",\"additionalProperties\":{}},{\"identifier\":\"http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35?version\u003d1\",\"identifierType\":\"URL\",\"additionalProperties\":{}}],\"creators\":[],\"titles\":[{\"title\":\"schema_2022_08_30_13_35\",\"titleType\":\"OTHER\",\"additionalProperties\":{}}],\"subjects\":[],\"contributors\":[],\"dates\":[{\"date\":\"Tue Aug 30 13:35:23 CEST 2022\",\"dateType\":\"CREATED\",\"additionalProperties\":{}},{\"date\":\"Tue Aug 30 13:35:23 CEST 2022\",\"dateType\":\"UPDATED\",\"additionalProperties\":{}}],\"alternateIdentifiers\":[],\"relatedIdentifiers\":[],\"sizes\":[],\"formats\":[\"JSON\"],\"rightsList\":[],\"descriptions\":[],\"geoLocations\":[],\"fundingReferences\":[],\"additionalProperties\":{}}"
    }
  ],
  "header": [
    {
      "id": "ETag",
      "value": "\"-191631817\""
    }
  ]
}
### Update Digital Object
Operation ID: OP_UPDATE
Body   :
{
  "clientId": "metastore_Schema_ID",
  "targetId": "schema_2022_08_30_13_35",
  "token": "noToken",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [
      {
        "title": "schema_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "publisher": "NFDI4Ing",
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [
      "JSON"
    ],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "schema",
      "type": "application/json",
      "value": "{\n    \"$schema\": \"http://json-schema.org/draft/2019-09/schema#\",\n    \"$id\": \"http://www.example.org/schema/json\",\n    \"type\": \"object\",\n    \"title\": \"Json schema for tests\",\n    \"default\": {},\n    \"required\": [\n        \"title\",\n        \"date\"\n    ],\n    \"properties\": {\n        \"title\": {\n            \"$id\": \"#/properties/string\",\n            \"type\": \"string\",\n            \"title\": \"Title\",\n            \"description\": \"Title of object.\"\n        },\n        \"date\": {\n            \"$id\": \"#/properties/string\",\n            \"type\": \"string\",\n            \"format\": \"date\",\n            \"title\": \"Date\",\n            \"description\": \"Date of object\"\n        },\n        \"note\": {\n            \"$id\": \"#/properties/string\",\n            \"type\": \"string\",\n            \"title\": \"Note\",\n            \"description\": \"Additonal information about object.\"\n        }\n    },\n    \"additionalProperties\": false\n}"
    }
  ],
  "header": [
    {
      "id": "If-Match",
      "value": "\"-191631817\""
    }
  ]
}

#### Return
{
  "id": "schema_2022_08_30_13_35",
  "datacite": {
    "identifiers": [
      {
        "identifier": "schema_2022_08_30_13_35",
        "identifierType": "Handle",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "identifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35?version\u003d2",
        "identifierType": "URL",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "creators": [],
    "titles": [
      {
        "title": "schema_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "subjects": [],
    "contributors": [],
    "dates": [
      {
        "date": "Tue Aug 30 13:35:23 CEST 2022",
        "dateType": "CREATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "date": "Tue Aug 30 13:35:24 CEST 2022",
        "dateType": "UPDATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [
      "JSON"
    ],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [],
  "header": []
}
<summary>ClientId: metastore_Schema_ID</summary>
</details>
<details>

## ClientId: metastore_metadata_ID
### Create Digital Object
Operation ID: OP_CREATE
Body   :
{
  "clientId": "metastore_metadata_ID",
  "token": "noToken",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [
      {
        "title": "document_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "publisher": "NFDI4Ing",
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [
      {
        "relatedIdentifier": "http://example.org/relatedResource",
        "relatedIdentifierType": "URL",
        "relationType": "IS_METADATA_FOR",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "relatedIdentifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35",
        "relatedIdentifierType": "URL",
        "relationType": "IS_DERIVED_FROM",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "document",
      "type": "application/json",
      "value": "{\n        \"title\": \"Title\",\n        \"date\": \"2022-04-25\"\n}"
    }
  ],
  "header": []
}
#### Return
{
  "id": "document_2022_08_30_13_35",
  "datacite": {
    "identifiers": [
      {
        "identifier": "document_2022_08_30_13_35",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "creators": [],
    "titles": [
      {
        "title": "document_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "subjects": [],
    "contributors": [],
    "dates": [
      {
        "date": "Tue Aug 30 13:35:24 CEST 2022",
        "dateType": "CREATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "date": "Tue Aug 30 13:35:24 CEST 2022",
        "dateType": "UPDATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [
      {
        "relatedIdentifier": "http://example.org/relatedResource",
        "relatedIdentifierType": "URL",
        "relationType": "IS_METADATA_FOR",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "relatedIdentifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35",
        "relatedIdentifierType": "URL",
        "relationType": "IS_DERIVED_FROM",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [],
  "header": [
    {
      "id": "ETag",
      "value": "\"710066755\""
    }
  ]
}

Remark: ETag is needed for updates.

### Get Digital Object (metadata)
Operation ID: OP_RETRIEVE
Body   :
{
  "clientId": "metastore_metadata_ID",
  "targetId": "document_2022_08_30_13_35",
  "token": "noToken",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [],
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {}
  },
  "attributes": [],
  "elements": [
    {
      "id": "metadata",
      "value": "Any value"
    }
  ],
  "header": []
}
#### Return
{
  "id": "document_2022_08_30_13_35",
  "datacite": {
    "identifiers": [
      {
        "identifier": "document_2022_08_30_13_35",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "creators": [],
    "titles": [
      {
        "title": "document_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "subjects": [],
    "contributors": [],
    "dates": [
      {
        "date": "Tue Aug 30 13:35:24 CEST 2022",
        "dateType": "CREATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "date": "Tue Aug 30 13:35:24 CEST 2022",
        "dateType": "UPDATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [
      {
        "relatedIdentifier": "http://example.org/relatedResource",
        "relatedIdentifierType": "URL",
        "relationType": "IS_METADATA_FOR",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "relatedIdentifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35",
        "relatedIdentifierType": "URL",
        "relationType": "IS_DERIVED_FROM",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "metadata",
      "value": "{\"identifiers\":[{\"identifier\":\"document_2022_08_30_13_35\",\"additionalProperties\":{}}],\"creators\":[],\"titles\":[{\"title\":\"document_2022_08_30_13_35\",\"titleType\":\"OTHER\",\"additionalProperties\":{}}],\"subjects\":[],\"contributors\":[],\"dates\":[{\"date\":\"Tue Aug 30 13:35:24 CEST 2022\",\"dateType\":\"CREATED\",\"additionalProperties\":{}},{\"date\":\"Tue Aug 30 13:35:24 CEST 2022\",\"dateType\":\"UPDATED\",\"additionalProperties\":{}}],\"alternateIdentifiers\":[],\"relatedIdentifiers\":[{\"relatedIdentifier\":\"http://example.org/relatedResource\",\"relatedIdentifierType\":\"URL\",\"relationType\":\"IS_METADATA_FOR\",\"additionalProperties\":{}},{\"relatedIdentifier\":\"http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35\",\"relatedIdentifierType\":\"URL\",\"relationType\":\"IS_DERIVED_FROM\",\"additionalProperties\":{}}],\"sizes\":[],\"formats\":[],\"rightsList\":[],\"descriptions\":[],\"geoLocations\":[],\"fundingReferences\":[],\"additionalProperties\":{}}"
    }
  ],
  "header": [
    {
      "id": "ETag",
      "value": "\"710066755\""
    }
  ]
}
### Get Digital Object (metadata & document)
Operation ID: OP_RETRIEVE
Body   :
{
  "clientId": "metastore_metadata_ID",
  "targetId": "document_2022_08_30_13_35",
  "token": "noToken",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [],
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {}
  },
  "attributes": [],
  "elements": [
    {
      "id": "metadata",
      "value": "Any value"
    },
    {
      "id": "document",
      "value": "Any value"
    }
  ],
  "header": []
}

#### Return
{
  "id": "document_2022_08_30_13_35",
  "datacite": {
    "identifiers": [
      {
        "identifier": "document_2022_08_30_13_35",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "creators": [],
    "titles": [
      {
        "title": "document_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "subjects": [],
    "contributors": [],
    "dates": [
      {
        "date": "Tue Aug 30 13:35:24 CEST 2022",
        "dateType": "CREATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "date": "Tue Aug 30 13:35:24 CEST 2022",
        "dateType": "UPDATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [
      {
        "relatedIdentifier": "http://example.org/relatedResource",
        "relatedIdentifierType": "URL",
        "relationType": "IS_METADATA_FOR",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "relatedIdentifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35",
        "relatedIdentifierType": "URL",
        "relationType": "IS_DERIVED_FROM",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "metadata",
      "value": "{\"identifiers\":[{\"identifier\":\"document_2022_08_30_13_35\",\"additionalProperties\":{}}],\"creators\":[],\"titles\":[{\"title\":\"document_2022_08_30_13_35\",\"titleType\":\"OTHER\",\"additionalProperties\":{}}],\"subjects\":[],\"contributors\":[],\"dates\":[{\"date\":\"Tue Aug 30 13:35:24 CEST 2022\",\"dateType\":\"CREATED\",\"additionalProperties\":{}},{\"date\":\"Tue Aug 30 13:35:24 CEST 2022\",\"dateType\":\"UPDATED\",\"additionalProperties\":{}}],\"alternateIdentifiers\":[],\"relatedIdentifiers\":[{\"relatedIdentifier\":\"http://example.org/relatedResource\",\"relatedIdentifierType\":\"URL\",\"relationType\":\"IS_METADATA_FOR\",\"additionalProperties\":{}},{\"relatedIdentifier\":\"http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35\",\"relatedIdentifierType\":\"URL\",\"relationType\":\"IS_DERIVED_FROM\",\"additionalProperties\":{}}],\"sizes\":[],\"formats\":[],\"rightsList\":[],\"descriptions\":[],\"geoLocations\":[],\"fundingReferences\":[],\"additionalProperties\":{}}"
    },
    {
      "id": "document",
      "value": "{\n        \"title\": \"Title\",\n        \"date\": \"2022-04-25\"\n}"
    }
  ],
  "header": [
    {
      "id": "ETag",
      "value": "\"710066755\""
    }
  ]
}
### Update Digital Object
Operation ID: OP_UPDATE
Body   :
{
  "clientId": "metastore_metadata_ID",
  "targetId": "document_2022_08_30_13_35",
  "token": "noToken",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [
      {
        "title": "document_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "publisher": "NFDI4Ing",
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [
      {
        "relatedIdentifier": "http://example.org/relatedResource",
        "relatedIdentifierType": "URL",
        "relationType": "IS_METADATA_FOR",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "relatedIdentifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35",
        "relatedIdentifierType": "URL",
        "relationType": "IS_DERIVED_FROM",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "document",
      "type": "application/json",
      "value": "{\n        \"title\": \"Title\",\n        \"date\": \"2022-04-25\",\n        \"note\": \"Any note here\"\n}"
    }
  ],
  "header": [
    {
      "id": "If-Match",
      "value": "\"710066755\""
    }
  ]
}
#### Return
{
  "id": "document_2022_08_30_13_35",
  "datacite": {
    "identifiers": [
      {
        "identifier": "document_2022_08_30_13_35",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "creators": [],
    "titles": [
      {
        "title": "document_2022_08_30_13_35",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "subjects": [],
    "contributors": [],
    "dates": [
      {
        "date": "Tue Aug 30 13:35:24 CEST 2022",
        "dateType": "CREATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "date": "Tue Aug 30 13:35:24 CEST 2022",
        "dateType": "UPDATED",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [
      {
        "relatedIdentifier": "http://example.org/relatedResource",
        "relatedIdentifierType": "URL",
        "relationType": "IS_METADATA_FOR",
        "additionalProperties": {
          "additionalProperties": {}
        }
      },
      {
        "relatedIdentifier": "http://localhost:8040/api/v1/schemas/schema_2022_08_30_13_35",
        "relatedIdentifierType": "URL",
        "relationType": "IS_DERIVED_FROM",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [],
  "header": []
}

<summary>ClientId: metastore_metadata_ID</summary>
</details>
<details>

## ClientId: coscine_Schema_ID
### Create Digital Object
NOT implemented yet!

### Get Digital Object (data)
Operation ID: OP_RETRIEVE
Body   :
{
  "clientId": "coscine_Schema_ID",
  "targetId": "https://purl.org/coscine/ap/radar/",
  "token": "ey[...]JA",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [],
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {}
  },
  "attributes": [],
  "elements": [
    {
      "id": "schema",
      "value": "Any value"
    }
  ],
  "header": []
}
#### Return
{
  "id": "https://purl.org/coscine/ap/radar/",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [],
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "schema",
      "value": "[{\"@id\":\"https://purl.org/coscine/ap/radar/\",\"@graph\":[{\"@id\":\"https://purl.org/coscine/ap/radar#subject\",\"http://www.w3.org/ns/shacl#path\":[{\"@id\":\"http://purl.org/dc/terms/subject\"}],\"http://www.w3.org/ns/shacl#order\":[{\"@value\":\"3\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#maxCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#class\":[{\"@id\":\"http://www.dfg.de/dfg_profil/gremien/fachkollegien/faecher/\"}],\"http://www.w3.org/ns/shacl#name\":[{\"@language\":\"de\",\"@value\":\"Fachrichtung\"},{\"@language\":\"en\",\"@value\":\"Subject Area\"}]},{\"@id\":\"https://purl.org/coscine/ap/radar#created\",\"http://www.w3.org/ns/shacl#path\":[{\"@id\":\"http://purl.org/dc/terms/created\"}],\"http://www.w3.org/ns/shacl#order\":[{\"@value\":\"2\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#minCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#maxCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#name\":[{\"@language\":\"en\",\"@value\":\"Production Date\"},{\"@language\":\"de\",\"@value\":\"Erstelldatum\"}],\"http://www.w3.org/ns/shacl#datatype\":[{\"@id\":\"http://www.w3.org/2001/XMLSchema#date\"}],\"http://www.w3.org/ns/shacl#defaultValue\":[{\"@value\":\"{TODAY}\"}]},{\"@id\":\"https://purl.org/coscine/ap/radar#creator\",\"http://www.w3.org/ns/shacl#path\":[{\"@id\":\"http://purl.org/dc/terms/creator\"}],\"http://www.w3.org/ns/shacl#order\":[{\"@value\":\"0\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#minCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#maxCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#name\":[{\"@language\":\"de\",\"@value\":\"Ersteller\"},{\"@language\":\"en\",\"@value\":\"Creator\"}],\"http://www.w3.org/ns/shacl#minLength\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#datatype\":[{\"@id\":\"http://www.w3.org/2001/XMLSchema#string\"}],\"http://www.w3.org/ns/shacl#defaultValue\":[{\"@value\":\"{ME}\"}]},{\"@id\":\"https://purl.org/coscine/ap/radar#rights\",\"http://www.w3.org/ns/shacl#path\":[{\"@id\":\"http://purl.org/dc/terms/rights\"}],\"http://www.w3.org/ns/shacl#order\":[{\"@value\":\"5\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#maxCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#name\":[{\"@language\":\"en\",\"@value\":\"Rights\"},{\"@language\":\"de\",\"@value\":\"Berechtigung\"}],\"http://www.w3.org/ns/shacl#datatype\":[{\"@id\":\"http://www.w3.org/2001/XMLSchema#string\"}]},{\"@id\":\"https://purl.org/coscine/ap/radar#rightsHolder\",\"http://www.w3.org/ns/shacl#path\":[{\"@id\":\"http://purl.org/dc/terms/rightsHolder\"}],\"http://www.w3.org/ns/shacl#order\":[{\"@value\":\"6\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#maxCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#name\":[{\"@language\":\"en\",\"@value\":\"Rightsholder\"},{\"@language\":\"de\",\"@value\":\"Rechteinhaber\"}],\"http://www.w3.org/ns/shacl#datatype\":[{\"@id\":\"http://www.w3.org/2001/XMLSchema#string\"}]},{\"@id\":\"https://purl.org/coscine/ap/radar#title\",\"http://www.w3.org/ns/shacl#path\":[{\"@id\":\"http://purl.org/dc/terms/title\"}],\"http://www.w3.org/ns/shacl#order\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#minCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#maxCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#name\":[{\"@language\":\"de\",\"@value\":\"Titel\"},{\"@language\":\"en\",\"@value\":\"Title\"}],\"http://www.w3.org/ns/shacl#minLength\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#datatype\":[{\"@id\":\"http://www.w3.org/2001/XMLSchema#string\"}]},{\"@id\":\"https://purl.org/coscine/ap/radar#type\",\"http://www.w3.org/ns/shacl#path\":[{\"@id\":\"http://purl.org/dc/terms/type\"}],\"http://www.w3.org/ns/shacl#order\":[{\"@value\":\"4\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#maxCount\":[{\"@value\":\"1\",\"@type\":\"http://www.w3.org/2001/XMLSchema#integer\"}],\"http://www.w3.org/ns/shacl#class\":[{\"@id\":\"http://purl.org/dc/dcmitype/\"}],\"http://www.w3.org/ns/shacl#name\":[{\"@language\":\"en\",\"@value\":\"Resource\"},{\"@language\":\"de\",\"@value\":\"Ressource\"}]},{\"@id\":\"https://purl.org/coscine/ap/radar/\",\"@type\":[\"http://www.w3.org/ns/shacl#NodeShape\"],\"http://purl.org/dc/terms/license\":[{\"@id\":\"http://spdx.org/licenses/MIT\"}],\"http://purl.org/dc/terms/rights\":[{\"@value\":\"Copyright © 2020 IT Center, RWTH Aachen University\"}],\"http://www.w3.org/ns/shacl#targetClass\":[{\"@id\":\"https://purl.org/coscine/ap/radar/\"}],\"http://www.w3.org/ns/shacl#closed\":[{\"@value\":\"true\",\"@type\":\"http://www.w3.org/2001/XMLSchema#boolean\"}],\"http://www.w3.org/ns/shacl#property\":[{\"@id\":\"https://purl.org/coscine/ap/radar#creator\"},{\"@id\":\"https://purl.org/coscine/ap/radar#rights\"},{\"@id\":\"https://purl.org/coscine/ap/radar#subject\"},{\"@id\":\"https://purl.org/coscine/ap/radar#created\"},{\"@id\":\"_:b6576279\"},{\"@id\":\"https://purl.org/coscine/ap/radar#type\"},{\"@id\":\"https://purl.org/coscine/ap/radar#rightsHolder\"},{\"@id\":\"https://purl.org/coscine/ap/radar#title\"}],\"http://purl.org/dc/terms/title\":[{\"@language\":\"en\",\"@value\":\"radar application profile\"}],\"http://purl.org/dc/terms/publisher\":[{\"@id\":\"https://itc.rwth-aachen.de/\"}]},{\"@id\":\"_:b6576279\",\"http://www.w3.org/ns/shacl#path\":[{\"@id\":\"http://www.w3.org/1999/02/22-rdf-syntax-ns#type\"}]}]}]"
    }
  ],
  "header": []
}

<summary>ClientId: coscine_Schema_ID</summary>
</details>
<details>

## ClientId: coscine_Metadata_ID
### Create Digital Object
Operation ID: OP_RETRIEVE
Body   :
{
  "id": "21.11192/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path\u003d/turntableRestTest.txt",
  "clientId": "coscine_Metadata_ID",
  "token": "ey[...]JA",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [],
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {}
  },
  "attributes": [],
  "elements": [],
  "header": []
}
#### Return
- - -

### Get Digital Object (data)
Operation ID: OP_RETRIEVE
Body   :
{
  "id": "21.11192/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path\u003d/turntableRestTest.txt",
  "clientId": "coscine_Metadata_ID",
  "targetId": "21.11192/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path\u003d/turntableRestTest.txt",
  "token": "ey[...]JA",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [],
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {}
  },
  "attributes": [],
  "elements": [
    {
      "id": "document",
      "value": "Any value"
    },
    {
      "id": "digitalObjectId",
      "value": "21.11192/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path\u003d/turntableRestTest.txt"
    }
  ],
  "header": []
}
#### Return
{
  "id": "21.11192/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path\u003d/turntableRestTest.txt",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [],
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "document",
      "value": "{\"data\":{\"metadataStorage\":[{\"https://hdl.handle.net/21.11102/62b97a86-d3cf-4517-9b09-6a09cd9b476d@path\u003d%2FturntableRestTest.txt\":{\"http://purl.org/dc/terms/created\":[{\"value\":\"2022-08-29\",\"datatype\":\"http://www.w3.org/2001/XMLSchema#date\",\"type\":\"literal\"}],\"http://purl.org/dc/terms/creator\":[{\"value\":\"Volker Hartmann\",\"datatype\":\"http://www.w3.org/2001/XMLSchema#string\",\"type\":\"literal\"}],\"http://purl.org/dc/terms/rights\":[{\"value\":\"No rights\",\"datatype\":\"http://www.w3.org/2001/XMLSchema#string\",\"type\":\"literal\"}],\"http://purl.org/dc/terms/rightsHolder\":[{\"value\":\"Me\",\"datatype\":\"http://www.w3.org/2001/XMLSchema#string\",\"type\":\"literal\"}],\"http://purl.org/dc/terms/subject\":[{\"value\":\"http://www.dfg.de/dfg_profil/gremien/fachkollegien/liste/index.jsp?id\u003d201#201-02\",\"type\":\"uri\"}],\"http://purl.org/dc/terms/title\":[{\"value\":\"Another test\",\"datatype\":\"http://www.w3.org/2001/XMLSchema#string\",\"type\":\"literal\"}],\"http://purl.org/dc/terms/type\":[{\"value\":\"http://purl.org/dc/dcmitype/Text\",\"type\":\"uri\"}],\"http://www.w3.org/1999/02/22-rdf-syntax-ns#type\":[{\"value\":\"https://purl.org/coscine/ap/radar/\",\"type\":\"uri\"}]}}],\"fileStorage\":[]}}"
    }
  ],
  "header": []
}
### Update Digital Object
Operation ID: OP_UPDATE
Body   :
{
  "clientId": "coscine_Metadata_ID",
  "targetId": "21.11102/62b97a86-d3cf-4517-9b09-6a09cd9b476d#path\u003d/TestTheREST.txt",
  "token": "ey[...]JA",
  "datacite": {
    "identifiers": [],
    "creators": [],
    "titles": [
      {
        "title": "Final test update document_2022_08_30_14_14",
        "titleType": "OTHER",
        "additionalProperties": {
          "additionalProperties": {}
        }
      }
    ],
    "publisher": "NFDI4Ing",
    "subjects": [],
    "contributors": [],
    "dates": [],
    "alternateIdentifiers": [],
    "relatedIdentifiers": [],
    "sizes": [],
    "formats": [],
    "rightsList": [],
    "descriptions": [],
    "geoLocations": [],
    "fundingReferences": [],
    "additionalProperties": {
      "additionalProperties": {}
    }
  },
  "attributes": [],
  "elements": [
    {
      "id": "document",
      "type": "application/json",
      "value": "{\n\"http://purl.org/dc/terms/creator\": [{\n\"value\": \"Final test for updating creator with docker\",\n\"type\": \"literal\",\n      \"datatype\": \"http://www.w3.org/2001/XMLSchema#string\"\n    }],\n  \"http://purl.org/dc/terms/title\": [{\n      \"value\": \"Final test update with dockerized turntable!\",\n      \"type\": \"literal\",\n      \"datatype\": \"http://www.w3.org/2001/XMLSchema#string\"\n    }],\n  \"http://purl.org/dc/terms/created\": [{\n      \"value\": \"2022-06-28\",\n      \"type\": \"literal\",\n      \"datatype\": \"http://www.w3.org/2001/XMLSchema#date\"\n    }]\n}"
    }
  ],
  "header": []
}
#### Return
{
  "attributes": [],
  "elements": [],
  "header": []
}
<summary>ClientId: coscine_Metadata_ID</summary>
</details>


