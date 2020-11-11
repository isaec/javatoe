# javatoe
tictactoe in java, with an ai

this is not my best work by any mesure, its a learning project for robo

quite frankly, this code is *bad*

practicing encapsulation, so overkill encapsulation

for the record this is ai in the buzzword sense

## example game:

```
Would you like to be X(first) or O(second) or zero player? (1 or 2 or 0): 2
   |   |   
-----------
   |   |   
-----------
   |   |   

 X |   |   
-----------
   |   |   
-----------
   |   |   

Enter your move(1-9): 3
 X |   | O 
-----------
   |   |   
-----------
   |   |   

 X |   | O 
-----------
   |   |   
-----------
   |   | X 

Enter your move(1-9): 5
 X |   | O 
-----------
   | O |   
-----------
   |   | X 

 X |   | O 
-----------
   | O |   
-----------
 X |   | X 

Enter your move(1-9): 4
 X |   | O 
-----------
 O | O |   
-----------
 X |   | X 

Game over! Ai won!
 X |   | O 
-----------
 O | O |   
-----------
 X | X | X 
```


### kindly ignore


- [x] board object
- [x] print board
- [x] game logic
- [x] player object
- [x] game loop
- [x] ai object
- [ ] ~~minmax instead of random ai~~
- [x] basic state machine ai
- [ ] ~~ensure its unbeatable~~
- [x] choose who goes first
