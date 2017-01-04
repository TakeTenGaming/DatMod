# Changelog
The following is a list of changes in each release of the mod.

## 1.5.1
This update is a bug fix release.

**Changes**
[General]
- Dusts can now actually be processed in furnaces. My bad, forgot to add the smelting recipe xD

## 1.5.0
This update is a bug fix release.

**Changes**
[General]
- All blocks/items/ingots/ores are now registered in the Ore Dictionary

[Compatibility]
- [EnderIO] Diamondium and Emeraldi can now be pulverized into their respective gems
- [EnderIO] Ironium and Goldirite can now be pulverized into dusts using the Sag Mill
- [EnderIO] Diamonds and Diamondium can now be used as an alternative to Flint in the Sag Mill, with added bonuses

[Magnet]
- Activation/deactivation message should now display properly
- Texture has been improved
- Can now be crafted using Minecraft's Iron Ingot

[Tools]
- All tools have been rebalanced to improve/reduce statistics

[Code]
- All code has been reformatted to make it a bit easier on the eyes and easier to manage

## 1.4.2
This update is a bug fix release.

**Changes**
- Updated Forge (13.18.3.2185)
- Updated JEI (3.13.6.393)

**Fixes**
- Fixes a NullPointerException on launch

## 1.4.1
This update is a bug fix/general change release.

**Changes/Fixes**
- The mod can now run in Minecraft *1.9.4*, *1.10.2* as well as *1.11*
- Fixed Achievements not being properly registered.
- Fixed *Ore Miner* achievements being able to be received in any order, rather than Ironium->Diamondium->Emeraldi/Goldirite->Ore Miner
- Slightly changed the world welcome message

**Developer/Internal Changes**
- Added some developer documentation
- Added a base GuiHandler class
- Reorganized a few classes
- Moved in-class information to INFO.md
- Removed fully-qualified classnames from extends/imports (acid.stuff.Thing->Thing)
- Removed Block code that made all mod blocks not flammable
- Removed unused debug code
- Reimplemented debug code in a new way
- Removed redundant code from the Magnet class

**GitHub Changes**
- Changed the README to no longer include the mod logo as it was a bit large
- Organized the FEATURES file to be simpler and easier to read (still a work-in-progress)

## 1.4.0
This update is a bug fix release.

**Changes**
- Cleaned up Recipes a bit. No more redundant code, yay!
- Fixed Lapis Lazuli armors not being craftable due to wrong ingredient.
- Fixed Redstone Axe not being craftable

## 1.3.0
This update is a feature/general change release.

**Additions/Changes**
- Added achievements when mining ores (fixes #42)
- Added metadata support for Block and Item classes (fixes #43)
- Updated Forge (12.18.2.2171)
- Updated JEI (3.13.6.387)
- Removed code documentation to make room for something better.
- Removed old/unused/test classes

## 1.2.0
This update includes bug fixes, code changes and some new features. It's recommended to update to this version.

**Additions/Changes**
- Cleaned up/removed code that wasn't used or needed
- Adjusted Ore Generation values to allow for a bit more flexible ore generation
- Cleaned up Ore Generation code and added Overworld, Nether and The End ore definitions
- Adds "/profiler" command, useful for checking how many blocks are around you.
- Added 2 new tool sets: Lapis Lazuli & Redstone
- Adds hoes for each Ore type
- Adds armor for each Ore type
- Emeraldi and Diamondium now drops it's gem rather than the ore when mined. Silk Touch & Fortune are accounted for

**Fixes**
- Fixes entities always dropping bones on death, even if not killed by a player.
- Fixes "welcome" message being shown after death, rather than only on first login
- Fixes commands never being registered. Derp!

## 1.1.0
This update fixes some issues. It's recommended to update to this version.

- Fixes #15 - Magnet State Doesn't Persist on Reload, this should actually be fixed now.. I hope.. lol
- Fixes #17 - Change Creative Tabs to use Mod Items
- Fixes #18 - Some classes missing @SideOnly annotation
- Fixes #19 - Code Refactor, moved some classes around

## 1.0.0 - The Gold Update
This update has a few minor changes. It's recommend to update to this version.

**Changes**
- General code cleanup
- Update "README.md", "VERSION.md", "src/main/java/xlxacidxlx/datmod/DatMod.java"
  - Changes version number to *1.0.0*

**Bug/Issue Changes**
  - Fixes #1 - Adds documentation to the code to aid in development
  - Fixes #11 - Adds more configuration options
  - Fixes #12 - Adjusted Ore Generation
  - Fixes #14 - All Tools Have Identical Statistics
  - Fixes #15 - Magnet State Doesn't Persist on Reload

## 0.0.3 - Cleverly Titled Update
This update has a few minor code improvements. It's not a required update as no bugs were fixed, but I would recommend it if you want to stay current.

**Changes**
- Adds ore generation to The End and The Nether. Please note if generation seems lacking in the Overworld, it'll be the same in The End and Nether as the generation code is exactly the same.
- Removed some debug code as it's no longer needed
- Work on #12
- Fixes #10 - Gives the "welcome" message some color and flair. Also adds a configuration option to disable the message if you find it annoying.

## 0.0.2 - The Fix Update
This update just fixes a few of the bugs/issues I found after initially releasing the mod. No breaking changes are present in this build.

**Bug/Issue Fixes**
  - Fixes #2 - Magnet can replace other items
  - Fixes #3 - "Welcome" message displays twice
  - Fixes #4 - Missing Recipes
  - Fixes #5 - Items Wrongly Marked as "Not Implemented"
  - Fixes #8 - Classes Need Creation Header
  - Fixes #9 - Missing JEI Dependency

## 0.0.1 - Initial Release