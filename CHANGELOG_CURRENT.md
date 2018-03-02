## 3.0.1
### Bugs Fixed
- Ore Generation now respect config values
- Fixed `Diamondium Ore` not being able to be broken by `Ironium Pickaxe`
- Fixed `Get Diamondium` and `Get Emeraldi` advancements not triggering - they were looking for the Ore rather than the Gem
- Fixed ores not generating where we wanted them to
- Fixed `Goldirite Block` -> `Goldirite Ingot` recipe only returning 1 ingot

### Changes
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