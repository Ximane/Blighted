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

        Bosses
            Special Moves
            Gimmicks (?)

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
                BIG BOSS
    
    Player 
        Sprite/Animations
        Actions
        Upgrades
        Items
        Currency
            Conversion from temporary to long-term
        Stats

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