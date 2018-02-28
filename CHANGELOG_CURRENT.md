## 3.0.0 - The Great Refactoring
### Notes
- The `Furnace`, `Generator`, `Pulverizer` and `Power Bank` are not currently in this build. They will be added later when I can implement them in a better way
- For now, the `Magnet` no longer utilizes energy (will be reimplemented later)

### New Armors
- Coal
- Nether Quartz

### New Tool
- `Ultimate Pickaxe`: *Extremely* high durability mining utility

### Changes
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
