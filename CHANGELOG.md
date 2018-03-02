# Changelog
## 3.0.2
### Bugs Fixed
- Fixed XP being doubled when being pulled by the `Magnet` (fixes #58)
- Fixed `Magnet` not pulling XP to the player when inventory is full (fixes #59)

#### 3.0.1
##### Bugs Fixed
- Ore Generation now respect config values
- Fixed `Diamondium Ore` not being able to be broken by `Ironium Pickaxe`
- Fixed `Get Diamondium` and `Get Emeraldi` advancements not triggering - they were looking for the Ore rather than the Gem
- Fixed ores not generating where we wanted them to
- Fixed `Goldirite Block` -> `Goldirite Ingot` recipe only returning 1 ingot

##### Changes
- Removed some debug code
- Rewrote config files to be more logical and less cluttered
- Added config option for magnet velocity and lowered it to 0.03 - should fix #51
- Added config option for magnet to pull items/XP directly into the player (disabled by default)
  - Items will be added to the inventory immediately
  - XP will be given to the player
- Ores will now generate in the `Nether` and `The End`
- Adjusted harvest level of `Emeraldi Pickaxe` and `Ironium Pickaxe`
- Ore generation can now be disabled in `The End`, `Nether`, and `Overworld`
- All tools now require the previous tiers ingot/gem for crafting
- Changed `Magnet` recipe to require 2 redstone instead of 1
- Converted remaining block/ores to their own `Block` classes
- Adjusted efficiency, harvest level, and damage for some tools
- Added another tooltip to the `Magnet` explaining what it does
- The `Magnet` now also looks above and below the player when looking for items/XP to pick up
- Slightly upped the `Magnet`'s range from 10 to 12

#### 3.0.0 - The Great Refactoring
##### Notes
- The `Furnace`, `Generator`, `Pulverizer` and `Power Bank` are not currently in this build. They will be added later when I can implement them in a better way
- For now, the `Magnet` no longer utilizes energy (will be reimplemented later)

##### New Armors
- Coal
- Nether Quartz

##### New Tool
- `Ultimate Pickaxe`: *Extremely* high durability mining utility

##### Changes
- Rebuilt from the ground up for better performance
- Completely rewrote the Config system for easier management and changes
  - Armors can now be disabled via the config
  - Tools can now be disabled via the config
  - Ores will be disabled if armors/tools are disabled via the config
- Achievements have been rewritten to utilize Minecraft's Advancement System
  - New advancements:
    - Ore Excavator
    - Ultimate Pickaxe
- Recipes have been redone to utilize Minecraft's new JSON Recipe System
- Attempted to rebalance all armors (again)
- All Creative Tabs have been condensed into one (may change in a later update)
- Creative Tab now has a search bar
- When attempting to generate ores in an unsupported dimension, a message will be logged to console.
- Added back the `/profiler <id>` command to see how many blocks are in a specific area.
  - Command search has been rewritten for (hopefully) better performance
  - Output of command has been revamped and provides more information
- Ore blocks now let off a little bit of light
- `Diamondium` and `Emeraldi` should now drop more gems when harvested with Fortune
- All gem/ingot blocks can now be un-crafted (1 block -> 9 gem/ingot)
- Updated logo in `mcmod.info`
