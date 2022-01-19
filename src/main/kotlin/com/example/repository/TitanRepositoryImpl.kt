package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Titan

const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"

class TitanRepositoryImpl : TitanRepository {

    // get this list of titans from database

    override val titans = listOf(
        Titan(
            id = 1,
            name = "Armored Titan",
            image = "/images/armored.jpg",
            about = "The Armored Titan (鎧の巨人 Yoroi no Kyojin) is one of the Nine Titans that possesses armored plates of skin across its body. It is currently in the possession of Reiner Braun. The Armored Titan specializes in hardening. If it charges in at full speed, the gates of any wall will crumble.It is an elusive threat to humanity within the Walls, first appearing five years ago during the fall of Wall Maria.",
            rating = 4.0,
            height = 15,
            type = "Titan Shifter",
            inheritors = listOf(
                "Reiner Braun"
            ),
            abilities = listOf(
                "Armored skin",
                "Hardening",
                "Regeneration",
                "Defense"
            ),
            otherNames = listOf(
                "Marley's Shield"
            )
        ),
        Titan(
            id = 2,
            name = "Attack Titan",
            image = "/images/attack.jpg",
            about = "The Attack Titan (進撃の巨人 Shingeki no Kyojin) is one of the Nine Titans that has pushed ever forward, seeking out freedom. For the sake of freedom, it fights. It is currently in the possession of Eren Jaeger.",
            rating = 4.5,
            height = 15,
            type = "Titan Shifter",
            inheritors = listOf(
                "Eren Jaeger",
                "Grisha Jaeger",
                "Eren Kruger"
            ),
            abilities = listOf(
                "Memory inheritance",
                "Hardening skin",
                "Speed",
                "Strength",
                "Durability",
                "Regeneration"
            ),
            otherNames = listOf(
                "Eren's Titan",
                "Mysterious Titan",
                "Berserk Titan",
                "Crazy-berserker Titan"
            )
        ),
        Titan(
            id = 3,
            name = "Beast Titan",
            image = "/images/beast.jpg",
            about = "The Beast Titan (獣の巨人 Kemono no Kyojin) is one of the Nine Titans. It has a unique ape-like appearance and is slightly larger than most Titans. The Beast Titan is as potent as ever. Though slightly larger than the other Titans, its throwing technique is dreadful on another level. What's more, his blood seems to have hidden power.It is currently in the possession of Zeke Jaeger, and first appeared during the invasion of Wall Rose.",
            rating = 4.5,
            height = 17,
            type = "Titan Shifter",
            inheritors = listOf(
                "Zeke Jeager",
                "Tom Xaver"
            ),
            abilities = listOf(
                "Powerful Throwing",
                "Accuracy",
                "Speech",
                "Titan Control (Only for titan users with Royal Blood)",
                "Hardening skin",
                "Regeneration"
            ),
            otherNames = listOf(
                "Monkey"
            )
        ), Titan(
            id = 4,
            name = "Cart Titan",
            image = "/images/cart.png",
            about = "The Cart Titan (車力の巨人 Shariki no Kyojin) is one of the Nine Titans with a quadrupedal form that possesses incredible speed and endurance, suitable for long missions. It can be fitted with different equipment to extend its usefulness.It is currently in the possession of Pieck Finger. It acted as a scout and mule in Zeke Jaeger's army during the battle of Shiganshina District.",
            rating = 3.5,
            height = 4,
            type = "Titan Shifter",
            inheritors = listOf(
                "Pieck Finger"
            ),
            abilities = listOf(
                "Quadrupedal form",
                "High endurance",
                "Speech",
                "Speed",
                "Agility",
                "Regeneration"
            ),
            otherNames = listOf(
                "Cart",
                "Quadruped-type",
                "Quadrupedal-type"
            )
        ),
        Titan(
            id = 5,
            name = "Colossal Titan",
            image = "/images/colossal.jpg",
            about = "The Colossal Titan (超大型巨人 Chō ōgata Kyojin) is one of the Nine Titans and serves as the primary antagonist of the first three seasons of Attack on Titan series. This Titan is notable for its massive size and significant control over the steam emitted by its Titan body along with the user's control over the power of the blast released by its transformation. It is currently in the possession of Armin Arlelt. The Colossal Titan first appeared in the year 845 during the fall of Wall Maria and later re-emerged in 850 at Trost District.",
            rating = 4.5,
            height = 60,
            type = "Titan Shifter",
            inheritors = listOf(
                "Armin Arlelt",
                "Bertholdt Hover"
            ),
            abilities = listOf(
                "Explosive transformation with control of blast radius",
                "Size",
                "Strength",
                "Steam Emission",
                "Regeneration"
            ),
            otherNames = listOf(
                "Colossal",
                "God of Destruction"
            )
        ),
        Titan(
            id = 6,
            name = "Female Titan",
            image = "/images/female.jpg",
            about = "The Female Titan (女型の巨人 Megata no Kyojin) is one of the Nine Titans and possesses the ability to selectively harden parts of its skin.The Female Titan. Versatility is its biggest strength. On top of its mobility and endurance, its hardened strikes are incredibly destructive. The range is limited, but it can call Pure Titans, too.It is currently in the possession of Annie Leonhart, though it is unusable while she is comatose.",
            rating = 4.0,
            height = 15,
            type = "Titan Shifter",
            inheritors = listOf(
                "Annie Leonhart"
            ),
            abilities = listOf(
                "Endurance",
                "Mobility",
                "Influence Pure Titans",
                "Hardening skin",
                "Crystallization",
                "Speed",
                "Strength",
                "Regeneration"
            ),
            otherNames = listOf(
                "Female-looking Titan",
                "Woman Type Titan"
            )
        ), Titan(
            id = 7,
            name = "Founding Titan",
            image = "/images/founding.jpg",
            about = "The Founding Titan (始祖の巨人 Shiso no Kyojin) is one of the Nine Titans that was once in the possession of the Reiss family, who passed it down from generation to generation. Its screams can alter the minds of both humans and Titans, but in the case of the former, some bloodlines are exempt from its power. It is currently in the possession of Eren Jaeger, although Eren's lack of royal blood means the Titan is unusable in its current form. The Warriors seek to recover the Founding Titan's power for Marley, and they call it the Coordinate (座標 Zahyō),because it is the point where all paths intersect.",
            rating = 5.0,
            height = 13,
            type = "Titan Shifter",
            inheritors = listOf(
                "Eren Jaeger",
                "Grisha Jaeger",
                "Frieda Reiss",
                "Uri Reiss",
                "Rod & Uri's Father",
                "Karl Fritz",
                "Ymir Fritz"
            ),
            abilities = listOf(
                "Titan Control",
                "Titan Creation",
                "Royal Bloodline Necessity",
                "Memory Manipulation of subjects of ymir",
                "Anatomical Manipulation",
                "Regeneration"
            ),
            otherNames = listOf(
                "Coordinate",
                "Royal family's power",
                "Scream",
                "God"
            )
        ),
        Titan(
            id = 8,
            name = "Jaw Titan",
            image = "/images/jaw.jpg",
            about = "The Jaw Titan (顎の巨人 Agito no Kyojin) is one of the Nine Titans with a ferociously powerful set of jaws and claws that are able to tear through almost anything.The Jaw Titan is an assault weapon. It's as speedy as it is small, with claws and jaw that crush nearly everything. It is currently in the possession of Porco Galliard.",
            rating = 4.5,
            height = 5,
            type = "Titan Shifter",
            inheritors = listOf(
                "Porco Galliard",
                "Ymir",
                "Marcel Galliard"
            ),
            abilities = listOf(
                "Hardened jaw & claws",
                "Agility",
                "Speed",
                "Strength",
                "Regeneration"
            ),
            otherNames = listOf(
                "Jaw"
            )
        ),
        Titan(
            id = 9,
            name = "War Hammer Titan",
            image = "/images/warhammer.png",
            about = "The War Hammer Titan (戦鎚の巨人 Sentsui no Kyojin) is one of the Nine Titans that possesses the ability to create any structure out of hardened Titan flesh. Until the Year 854, it was kept within the Tybur family for generations. It is currently in the possession of Eren Jaeger and fused with both the Attack Titan and Founding Titan.",
            rating = 4.5,
            height = 15,
            type = "Titan Shifter",
            inheritors = listOf(
                "Eren Jaeger",
                "Lara Tybur"
            ),
            abilities = listOf(
                "Armored skin",
                "Hardening Titan Flesh",
                "Remote Operation",
                "Durability",
                "Regeneration"
            ),
            otherNames = listOf(
                "War Hammer"
            )
        ), Titan(
            id = 10,
            name = "Rod Reiss Titan",
            image = "/images/reiss.jpg",
            about = "He is the largest Titan ever known, being twice the height of the Colossal Titan; however, his body was quite disproportionate, having an extremely large torso but a proportionally very small head and thin limbs, making him unable to stand up and needing to crawl on all fours.Like the Colossal Titan, his enormous size causes him to move slowly and generate lots of heat, always being covered by clouds of steam. The heat he produces is so high that it makes it impossible to go near him without getting burned, and causes objects such as trees around him to spontaneously combust.",
            rating = 3.0,
            height = 120,
            type = "Abnormal",
            inheritors = listOf(
                "Rod Reiss"
            ),
            abilities = listOf(
                "Massive size",
                "Heat and steam emission",
                "Regeneration"
            ),
            otherNames = listOf(
                "Lord Reiss",
                "King of the Walls",
                "Rod Reiss"
            )
        ),
        Titan(
            id = 11,
            name = "Smiling Titan",
            image = "/images/dina.jpg",
            about = "Dina's Pure Titan was very tall and, like most regular Pure Titans, resembled a male human. Its main distinguishing feature was its characteristic smile, in which its lips are fixed wide open, exposing its teeth and gums at all times. Dina's Pure Titan had a thin, emaciated frame with stocky proportions, in which its ribs were visibly apparent, and it possessed an unusually-long neck. It had medium-length, light hair that only barely reached down to its neck and featured small, deeply sunken gray eyes.",
            rating = 3.0,
            height = 14,
            type = "Abnormal",
            inheritors = listOf(
                "Dina Fritz"
            ),
            abilities = listOf(
                "Regeneration"
            ),
            otherNames = listOf(
                "Smiling Titan"
            )
        ),
        Titan(
            id = 12,
            name = "Comrade D",
            image = "/images/comraded.jpg",
            about = "Comrade D (同士D Dōshi D) was a former Restorationist who was captured by the Marleyan Public Security and turned into a Titan for the crime of treason.Comrade D was a 3-4 meter class Pure Titan and had a disproportionately big head and shoulder-length, messy, brown hair with brown eyes. Its body was relatively toned, and it always had an angered expression on its face.",
            rating = 3.0,
            height = 4,
            type = "Pure",
            inheritors = listOf(
                "Comrade D"
            ),
            abilities = listOf(
                "Regeneration"
            ),
            otherNames = listOf(
                "Comrade D"
            )
        )
    )


    private fun provideTitans(
        heroes: List<Titan>,
        page: Int,
        limit: Int
    ): List<Titan> {
        val allTitans = heroes.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allTitans.size)
        return allTitans[page - 1]
    }


    override suspend fun getAllTitans(page: Int, limit: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                titans = titans,
                page = page,
                limit = limit
            )[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(
                titans = titans,
                page = page,
                limit = limit
            )[NEXT_PAGE_KEY],
            titans = provideTitans(
                heroes = titans,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        titans: List<Titan>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allTitans = titans.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allTitans.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allTitans.size) null else page + 1
        return mapOf(
            PREVIOUS_PAGE_KEY to prevPage,
            NEXT_PAGE_KEY to nextPage
        )
    }

    override suspend fun searchTitans(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            titans = findTitans(query = name)
        )
    }

    private fun findTitans(query: String?) = with(titans) {
        if (query.isNullOrEmpty())
            return emptyList<Titan>()
        else
            this.filter { it.name.lowercase().contains(query.lowercase()) }
    }

}