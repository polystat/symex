# symex
Symbolic Execution engine for finding bugs in EO programs

Functionally symex consists of the following parts:
- parsing CFG (Control Flow Graph) of a program;
- traversing the CFG and capture path constraints and symbolic equasions for variables;
- solving the constraints and equations;
- generating notifications based on specified checks;


Checks are supplied in predefined format.


Traversing can be extended via plugin mechanism.
