package org.base;

public class Payload {

	public static String createPet() {
		return "{\r\n" + "	\"id\": 1,\r\n" + "	\"category\": {\r\n" + "		\"id\": 1,\r\n"
				+ "		\"name\": \"string\"\r\n" + "	},\r\n" + "	\"name\": \"bird\",\r\n"
				+ "	\"photoUrls\": [\r\n" + "		\"string\"\r\n" + "	],\r\n" + "	\"tags\": [{\r\n"
				+ "		\"id\": 1,\r\n" + "		\"name\": \"string\"\r\n" + "	}],\r\n"
				+ "	\"status\": \"new available\"\r\n" + "}";

	}

	public static String updatePet() {
		return "{\r\n" + "	\"id\": 2,\r\n" + "	\"category\": {\r\n" + "		\"id\": 2,\r\n"
				+ "		\"name\": \"string\"\r\n" + "	},\r\n" + "	\"name\": \"puppy\",\r\n"
				+ "	\"photoUrls\": [\r\n" + "		\"string\"\r\n" + "	],\r\n" + "	\"tags\": [{\r\n"
				+ "		\"id\": 2,\r\n" + "		\"name\": \"string\"\r\n" + "	}],\r\n"
				+ "	\"status\": \"updated available\"\r\n" + "}";

	}

	public static String getPet() {
		return "{\r\n" + "  \"id\": 0,\r\n" + "  \"category\": {\r\n" + "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n" + "  },\r\n" + "  \"name\": \"doggie\",\r\n" + "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n" + "  ],\r\n" + "  \"tags\": [\r\n" + "    {\r\n" + "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n" + "    }\r\n" + "  ],\r\n" + "  \"status\": \"available\"\r\n" + "}";

	}

}
