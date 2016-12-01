# Changelog
The following is a list of changes in each release of the mod.

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