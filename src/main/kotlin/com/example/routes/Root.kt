package com.example.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.root() {
    get("/"){
        call.respond(
            message = "Welcome to Attack on Titan API !!\n" +
                    " \n" +
                    "This is an unofficial Attack on Titan fan made API , Feel free to check out the various endpoints in the API.\n" +
                    "\n" +
                    "Get All Titans - \n" +
                    "\n" +
                    "Sample Request :\n" +
                    "\n" +
                    "https://attack-on-titan-server.herokuapp.com/titans?limit=1&page=1\n" +
                    "\n" +
                    "Add page & limit as GET parameter to get all titans data in a paginated format (default values : page=1 and limit=3). Here the page param is the page number which you require and limit is the maximum number of items per page.\n" +
                    "\n" +
                    "Sample Response :\n" +
                    "\n" +
                    "{\n" +
                    "    \"success\": true,\n" +
                    "    \"message\": \"ok\",\n" +
                    "    \"prevPage\": null,\n" +
                    "    \"nextPage\": 2,\n" +
                    "    \"titans\": [\n" +
                    "        {\n" +
                    "            \"id\": 1,\n" +
                    "            \"name\": \"Armored Titan\",\n" +
                    "            \"image\": \"/images/armored.png\",\n" +
                    "            \"about\": \"The Armored Titan (鎧の巨人 Yoroi no Kyojin) is one of the Nine Titans that possesses armored plates of skin across its body. It is currently in the possession of Reiner Braun. The Armored Titan specializes in hardening. If it charges in at full speed, the gates of any wall will crumble.It is an elusive threat to humanity within the Walls, first appearing five years ago during the fall of Wall Maria.\",\n" +
                    "            \"rating\": 4.0,\n" +
                    "            \"height\": 15,\n" +
                    "            \"type\": \"Titan Shifter\",\n" +
                    "            \"inheritors\": [\n" +
                    "                \"Reiner Braun\"\n" +
                    "            ],\n" +
                    "            \"abilities\": [\n" +
                    "                \"Armored skin\",\n" +
                    "                \"Hardening\",\n" +
                    "                \"Regeneration\",\n" +
                    "                \"Defense\"\n" +
                    "            ],\n" +
                    "            \"otherNames\": [\n" +
                    "                \"Marley's Shield\",\n" +
                    "                \"Armored\"\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"lastUpdated\": 1643613186593\n" +
                    "}\n" +
                    "\n" +
                    "Search For Titans - \n" +
                    "\n" +
                    "Sample Request :\n" +
                    "\n" +
                    "https://attack-on-titan-server.herokuapp.com/titans/search?name=beast\n" +
                    "\n" +
                    "Search for titans by providing a name as a GET parameter.\n" +
                    "\n" +
                    "Sample Response :\n" +
                    "\n" +
                    "{\n" +
                    "    \"success\": true,\n" +
                    "    \"message\": \"ok\",\n" +
                    "    \"prevPage\": null,\n" +
                    "    \"nextPage\": null,\n" +
                    "    \"titans\": [\n" +
                    "        {\n" +
                    "            \"id\": 3,\n" +
                    "            \"name\": \"Beast Titan\",\n" +
                    "            \"image\": \"/images/beast.png\",\n" +
                    "            \"about\": \"The Beast Titan (獣の巨人 Kemono no Kyojin) is one of the Nine Titans. It has a unique ape-like appearance and is slightly larger than most Titans. The Beast Titan is as potent as ever. Though slightly larger than the other Titans, its throwing technique is dreadful on another level. What's more, his blood seems to have hidden power.It is currently in the possession of Zeke Jaeger, and first appeared during the invasion of Wall Rose.\",\n" +
                    "            \"rating\": 4.0,\n" +
                    "            \"height\": 17,\n" +
                    "            \"type\": \"Titan Shifter\",\n" +
                    "            \"inheritors\": [\n" +
                    "                \"Zeke Jaeger\",\n" +
                    "                \"Tom Xaver\"\n" +
                    "            ],\n" +
                    "            \"abilities\": [\n" +
                    "                \"Powerful Throwing\",\n" +
                    "                \"Accuracy\",\n" +
                    "                \"Speech\",\n" +
                    "                \"Titan Control (Only for titan users with Royal Blood)\",\n" +
                    "                \"Hardening skin\",\n" +
                    "                \"Regeneration\"\n" +
                    "            ],\n" +
                    "            \"otherNames\": [\n" +
                    "                \"Monkey\"\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"lastUpdated\": null\n" +
                    "}\n" +
                    "\n" +
                    "This API is still under development , more titans data and endpoints will be added soon .",
            status = HttpStatusCode.OK
        )
    }
}