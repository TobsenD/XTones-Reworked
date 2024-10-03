#!/bin/bash 

for i in {0..15}
do
cat <<EOF > ./src/main/resources/assets/xtonesreworked/blockstates/"$1"_block_"$i".json
    {
        "variants": {
            "": {
                "model": "xtonesreworked:block/$1_block_$i"
            }
        }
    }
EOF
cat <<EOF > ./src/main/resources/assets/xtonesreworked/models/block/"$1"_block_"$i".json
    {
        "parent": "block/cube_all",
        "textures": {
            "all": "xtonesreworked:block/$1/$i"
        }
    }
EOF
cat <<EOF > ./src/main/resources/assets/xtonesreworked/models/item/"$1"_block_"$i".json
    {
	"parent": "xtonesreworked:block/$1_block_$i"
}
EOF
cat <<EOF > ./src/main/resources/data/xtonesreworked/loot_tables/blocks/"$1"_block_"$i".json
{
    "type": "minecraft:block",
    "pools": [
        {
            "rolls": 1,
            "entries": [
                {
                    "type": "minecraft:item",
                    "name": "xtonesreworked:$1_block_$i"
                }
            ]
        }
    ]
}
EOF
cat <<EOF > ./src/main/resources/data/xtonesreworked/recipes/"$1"_block_"$i".json
{
	"type": "minecraft:crafting_shaped",
	"key": {
		"B": {
			"tag": "xtonesreworked:$1"
		},
		"C": {
			"tag": "c:dyes/yellow"
		}
	},
	"pattern": ["BBB", "BCB", "BBB"],
	"result": {
		"item": "xtonesreworked:$1_block_$i",
		"count": 8
	}
}
EOF
<<'###BLOCK-COMMENT' 
cat <<EOF > ./src/main/resources/data/xtonesreworked/recipes/"$1"_block_"$i"_from_stonecutting.json
{
	"type": "minecraft:stonecutting",
	"count": 1,
	"ingredient": {
	  "tag": "xtonesreworked:$1"
	},
	"result": "xtonesreworked:$1_block_$i"
  }
EOF
###BLOCK-COMMENT
done
cat <<EOF > ./src/main/resources/data/xtonesreworked/tags/items/"$1".json
{
	"replace": false,
	"values": [
		"xtonesreworked:$1_block_0",
		"xtonesreworked:$1_block_1",
		"xtonesreworked:$1_block_2",
		"xtonesreworked:$1_block_3",
		"xtonesreworked:$1_block_4",
		"xtonesreworked:$1_block_5",
		"xtonesreworked:$1_block_6",
		"xtonesreworked:$1_block_7",
		"xtonesreworked:$1_block_8",
		"xtonesreworked:$1_block_9",
		"xtonesreworked:$1_block_10",
		"xtonesreworked:$1_block_11",
		"xtonesreworked:$1_block_12",
		"xtonesreworked:$1_block_13",
		"xtonesreworked:$1_block_14",
		"xtonesreworked:$1_block_15"
	]
}
EOF
cat <<EOF > ./src/main/resources/data/xtonesreworked/recipes/"$1"_block_0_alternative.json
{
	"type": "minecraft:crafting_shaped",
	"key": {
		"B": {
			"item": "xtonesreworked:xtone_tile"
		},
		"C": {
			"tag": "c:dyes/yellow"
		}
	},
	"pattern": ["BBB", "BCB", "BBB"],
	"result": {
		"item": "xtonesreworked:$1_block_$i",
		"count": 8
	}
}
EOF