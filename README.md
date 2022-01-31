# Attack On Titan API

## Usage

## Get All Titans - 
Add page & limit as GET parameter to get all titans data in a paginated format (default values : page=1 and limit=3).
Here the page param is the page number which you require and limit is the maximum number of items per page.
Sample Request :

```http
GET https://attack-on-titan-server.herokuapp.com/titans?limit=1&page=1
```

Sample Response :

```json
{
    "success": true,
    "message": "ok",
    "prevPage": null,
    "nextPage": 2,
    "titans": [
        {
            "id": 1,
            "name": "Armored Titan",
            "image": "/images/armored.png",
            "about": "The Armored Titan (鎧の巨人 Yoroi no Kyojin) is one of the Nine Titans that possesses armored plates of skin across its body. It is currently in the possession of Reiner Braun. The Armored Titan specializes in hardening. If it charges in at full speed, the gates of any wall will crumble.It is an elusive threat to humanity within the Walls, first appearing five years ago during the fall of Wall Maria.",
            "rating": 4.0,
            "height": 15,
            "type": "Titan Shifter",
            "inheritors": [
                "Reiner Braun"
            ],
            "abilities": [
                "Armored skin",
                "Hardening",
                "Regeneration",
                "Defense"
            ],
            "otherNames": [
                "Marley's Shield",
                "Armored"
            ]
        }
    ],
    "lastUpdated": 1643613186593
}
```

## Search For Titans - 
Search for titans by providing a name as a GET parameter.

Sample Request :

```http
GET https://attack-on-titan-server.herokuapp.com/titans/search?name=beast
```

Sample Response :

```json
{
    "success": true,
    "message": "ok",
    "prevPage": null,
    "nextPage": null,
    "titans": [
        {
            "id": 3,
            "name": "Beast Titan",
            "image": "/images/beast.png",
            "about": "The Beast Titan (獣の巨人 Kemono no Kyojin) is one of the Nine Titans. It has a unique ape-like appearance and is slightly larger than most Titans. The Beast Titan is as potent as ever. Though slightly larger than the other Titans, its throwing technique is dreadful on another level. What's more, his blood seems to have hidden power.It is currently in the possession of Zeke Jaeger, and first appeared during the invasion of Wall Rose.",
            "rating": 4.0,
            "height": 17,
            "type": "Titan Shifter",
            "inheritors": [
                "Zeke Jaeger",
                "Tom Xaver"
            ],
            "abilities": [
                "Powerful Throwing",
                "Accuracy",
                "Speech",
                "Titan Control (Only for titan users with Royal Blood)",
                "Hardening skin",
                "Regeneration"
            ],
            "otherNames": [
                "Monkey"
            ]
        }
    ],
    "lastUpdated": null
}
```

<h4 align="center">
  <i>
    We are not affiliated, associated, authorized, endorsed by, or in any way officially connected with Attack On Titan , or any of its subsidiaries or its affiliates. The names Attack On Titan as well as related names, marks, emblems and images are registered trademarks of their respective owners.
  </i>
</h4>

More Updates and Endpoints coming soon...
