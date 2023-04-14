# Pokemon Team Builder

Java Spring API for building your own Pokémon team. Current version does
not allow moveset due to significant complexity of move ownership via Pokemon.

## Tables
### Pokemon
- PKMN_ID: Int (Key)
- PKMN_NAME: String
- TYPE1: String
- TYPE2: String
- STAGE: int

### Trainer
- TRAINER_ID: Int (Key)
- FIRST_NAME: String
- LAST_NAME: String
- EMAIL: String
- PHONE: String
- DOB: DATE (DD-MM-YYYY)

### Teams
- TEAM_ID: Int (Key)
- TRAINER_ID: Int

### TeamMember (Pokemon + TeamID)
- TEAM_ID: Int (Partial Key)
- PKMN_ID: Int (Partial Key)
- HealthEV: Int
- PhysicalAttackEV: Int
- SpecialAttackEV: Int
- PhysicalDefenseEV: Int
- SpecialDefenseEV: Int
- SpeedEV: Int
- HealthIV: Int
- PhysicalAttackIV: Int
- SpecialAttackIV: Int
- PhysicalDefenseIV: Int
- SpecialDefenseIV: Int
- SpeedEV: Int
