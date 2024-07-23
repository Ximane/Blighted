# Summer24

Things to work on (Semi-Ordered?)

    Rooms
        50 Types
            Figure out which mobs go where

    Mobs
        Attack Type
        Sprites/Animations
        Behavior
        Spawned-Item (Projectile) Behavior
        Drops
            Small chance to drop healing (Bacteria Pieces)
        Damage
        Weaknesses/Strengths (?)

            Pillman
                Ranged (Throw Pills)
                Common
                Low Health
                Medium-Low Damage
                Medium Attack Speed (3 Second CD?)
                Medium Speed Projectile - Set Distance, Obstacle Collission
                Low value normal drop
                Slow MS
                
            Syringe Soldier
                Melee
                Common
                Medium Health
                Low->Medium Damage (Ramping)
                Medium Attack Speed
                Low value common drop
                    Small chance to drop temporary damage boost (Diseased Blood)
                Medium MS

            Aqueous Attackers
                Ranged -> Pool
                Rare
                Low Health
                Projectile - No Damage; Poison pool - Heals allies, damages player - 2 Second low tick damage
                Slow attack speed (5 Sec CD; Pool lasts 3.5 Second, small area)
                    If pools surround 3/4 sides of a tile, tile becomes pooled - Same Duration as summoned pools
                Medium value common drop
                    Rare drop - Liquid form : Consumable item allowing going through walls - 4 Seconds
                Stationary/Very slow MS

            Capsule Lobber
                Summoner
                Rare / Epic
                Low Helath
                Knockback Melee attack (3 Sec CD) - No Damage; Ranged summon
                Slow attack speed (7 Sec CD; 2 Capsules per summon, Maximum 6 Capsules active per summoner)
                High value drop
                    Chance to drop capsule plate (Increase dmg resistance)
                Stationary

                Capsule
                    Melee
                    Medium Health
                    Low Damage
                    Medium Attack Speed
                    No Drops
                    Medium MS
                    Dies on death of summoner

            Inhaler Mages
                Ranged / Mage
                Rare
                Low Health
                Medium Damage
                Slow Attack Speed (6 Sec CD)
                Slow Projectile - AOE 2x2 Blast, Obstacle collision - Can destroy non-wall obstacles
                High value drop
                    Small chance to drop consumable room defeat item (Puff blast; Doesn't work on bosses)
                Stationary - 10 Sec CD Self-heal

            Cream Critters
                Melee
                Common
                Low Health
                Low Damage
                High Attack Speed
                Sparse, common drops
                High MS
                Leaves Cream splat on death (1 Second) with 5% chance to spawn new critter from splat

            Catalyst Crystal (Melee - Red)
                Tower
                Rare
                High Health
                25% Melee Damage Boost + 5% Heal pulse to mobs within 3 tiles
                Slow pulse (2 Seconds On, 5 Seconds off)
                Can be damaged by projectiles
                High value drop
                    Rare drop - Catalyst chunk (Increase Melee Damage, 10%)
                Stationary

            Catalyst Crystal (Ranged - Yellow)
                Tower
                Rare
                High Health
                10% Ranged Damage Boost + 5% Heal pulse to mobs within 3 tiles
                Slow pulse (2 Seconds On, 5 Seconds off)
                Can be damaged by melee
                High value drop
                    Rare drop - Catalyst chunk (Increase Ranged Damage, 5%)
                Stationary

            Catalyst Crystal (Melee Defense - Green)
                Tower
                Rare
                High Health
                10% Melee Damage Boost + 2% Heal pulse to mobs within 3 tiles
                Slow pulse (2 Seconds On, 5 Seconds off)
                Can be damaged by projectiles
                High value drop
                    Rare drop - Catalyst chunk (Increase Melee Resist, 4%)
                Stationary

            Catalyst Crystal (Ranged Defense - Purple)
                Tower
                Rare
                High Health
                20% Ranged Damage Resist + 2% Heal pulse to mobs within 3 tiles
                Slow pulse (2 Seconds On, 5 Seconds off)
                Can be damaged by melee
                High value drop
                    Rare drop - Catalyst chunk (Increase Ranged Resist, 8%)
                Stationary

            Catalyst Crystal (True Health - Pink)
                Tower
                Very Rare
                High Health
                10% Heal pulse to mobs within 3 tiles
                Slow pulse (1 Second On, 8 Seconds off)
                All damage
                High value drop
                    Rare drop - Catalyst chunk (10% Health boost - From base)
                Stationary

            Catalyst Crystal (Fused Damage - Orange)
                Tower
                Very Rare
                High Health
                30% Melee Damage Boost + 15% Ranged Damage Boost within 5 tiles
                All damage
                High value drop
                    Rare drop - Catalyst chunk (Increase Damage, Melee 8%, Ranged 4%)
                Stationary

            Catalyst Crystal (Fused Resist - Blue)
                Tower
                Very Rare
                High Health
                15% Ranged Damage Resist + 10% Melee Damage Resist within 3 tiles
                All damage
                High value drop
                    Rare drop - Catalyst chunk (Inrease Resist, 3% Melee, 6% Ranged)
                Stationary

            Catalyst Crystal (Infection - Black)
                Tower
                Ultra Rare
                High Health
                Gives DOT to Mob Attacks within 2 tiles (Small damage, 2 Second duration)
                All damage
                High value drop
                    Rare drop - Catalyst chunk (% Chance to heal damage dealt; 5% Melee, 2% Ranged)
                Stationary

            Catalyst Crystal (Shield - White)
                Tower
                Ultra Rare
                High Health
                Gives shield to Mobs within 2 tiles (Reduce incoming damage by XX)
                All damage
                High value drop
                    Rare drop - Catalyst chunk (3% to get Shield when killing mobs; Nullifies 1 instance of damage; Non-stacking)
                Stationary

        Bosses
            Special Moves
            Gimmicks (?)
            High value rewards (Currency + 1 Item/Modifier)

            Sulfa
                Ranged
                Boss
                Medium Boss Health
                High Boss Damage
                Low Attack Speed
                Dashes 0 to 10 tiles between attacks
                    Projectile - High speed, infinite distance, obstacle collision; Each hit = 5% healing reduction, stacking to 50%

            Minocycline
                Melee
                Boss
                Medium Boss Health
                Low Boss Damage
                High Attack Speed
                    Each hit decreases player resistance by 2%, stacking to 30%
                Medium MS

            Morphine
                Melee
                Boss
                Medium Boss Health
                Medium Boss Damage
                Medium Attack Speed
                Medium MS
                Painkiller form (Takes 1/2 damage at 1/4 health)

            Fentanyl
                Summoner
                Boss
                Medium Boss Health
                High Boss Damage, Reverse Scaling
                Summons Melee and Ranged Form (1x)
                    Summons can hit each other
                Only heals summons
                Stationary

                    Melee
                        Low Health
                        High Damage
                        High Attack Speed
                        Medium MS

                    Ranged
                        Low Health
                        High Damage
                        Medium Attack Speed
                        Slow MS

                            Medium Speed Projectile - Infinite distance, obstacle collision; 2 Tile cloud projectile (Powdery look)

                Reduce total damage/heals by 1/3 for boss upon each part death
                Leave 2x2 DOT pool upon death - Location of troop = Lower Right Corner

            Penicilin
                Ranged -> Melee
                Boss
                Medium Boss Health
                High Boss Damage -> Medium Boss Damage
                Slow Attack Speed -> Medium Attack Speed
                0 to 6 tile dash between attacks -> Medium MS
                Half Health : Goes from ranged to melee mode
                    Ranged : Antibacterial shield - DOT in adjacent tiles
                        Medium Speed Projectile - Infinite distance, obstacle collision
                    Melee : Antibacterial Block - Takes reduced projectile damage (-70%)

            Vancomycin
                Summoner
                BIG BOSS
                High Boss Health
                Three-Stage:
                    1 - Summon minions (10x, 2x)
                            Chosen from Melee + Tower Mob pool
                            Boss cannot be damaged
                    2 - Summons minions (8x, 2x)
                            Chosen from Ranged + Tower Mob pool
                            Boss cannot be damaged
                    3 - Combat Phase
                            Mage
                            Medium Boss Damage AOE
                            Slow Attack Speed
                            Reduced same type (Melee/Range) repeated damage (
                                1-3 hit - 0%
                                4-6 hit - 5%
                                7-9 hit - 15%
                                10-12 hit - 30%
                                13-15 hit - 50%
                                16-18 hit - 75%
                                19-24 hit - 100%
                                25+ hit - 100% + Heal 1% 
                            )
                            5 to 20 tile dash between attacks
                            Projectile - Slow moving, 3x3 burst centered on target tile; Ignores small obstacles (Model - Red liquid ball)  
    Player 
        Sprite/Animations
        Actions
            Move - WASD
            Use Item - ZXC
            Interact - E
            Inventory - 
        Upgrades
        Items
        Weapons
        Currency
            Conversion from temporary to long-term
            CATGU vs DNA
        Stats
            Spread - Speed
            Resilence - Damage Reduction
            Potency - Damage
            Adaptability - Luck
            Infectability - Attack Speed
            Vitality - Health

    Long-Term Upgrades
        Set vs Random "Research"
        Starting Items
        Costumes/Skins (Could provide stats)
    
    Items
        Heal
        Damage Boost
        Vampirism
        Reach
        Sight
        Abilities
            (Maximum three)