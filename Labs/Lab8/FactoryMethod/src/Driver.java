public class Driver {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    //By having ICheckerBoardFactory perform a new CheckerBoard or CheckerBoardMem, we can tell java which we want
    //to use through the dynamic type of the ICheckerBoardFactory to be CheckerBoardFactory or CheckerBoardMemFactory

    ICheckerBoardFactory factory = new CheckerBoardFactory();
    ICheckerBoard board1 = factory.makeCheckerBoard();
    ICheckerBoard board2 = factory.makeCheckerBoard();
    ICheckerBoard board3 = factory.makeCheckerBoard();
    ICheckerBoard board4 = factory.makeCheckerBoard();
    ICheckerBoard board5 = factory.makeCheckerBoard();
    ICheckerBoard board6 = factory.makeCheckerBoard();
    ICheckerBoard board7 = factory.makeCheckerBoard();
    ICheckerBoard board8 = factory.makeCheckerBoard();
    ICheckerBoard board9 = factory.makeCheckerBoard();
    ICheckerBoard board10 = factory.makeCheckerBoard();

    factory = new CheckerBoardMemFactory();

    ICheckerBoard board11 = factory.makeCheckerBoard();
    ICheckerBoard board12 = factory.makeCheckerBoard();
    ICheckerBoard board13 = factory.makeCheckerBoard();
    ICheckerBoard board14 = factory.makeCheckerBoard();
    ICheckerBoard board15 = factory.makeCheckerBoard();
    ICheckerBoard board16 = factory.makeCheckerBoard();
    ICheckerBoard board17 = factory.makeCheckerBoard();
    ICheckerBoard board18 = factory.makeCheckerBoard();
    ICheckerBoard board19 = factory.makeCheckerBoard();
    ICheckerBoard board20 = factory.makeCheckerBoard();
    //still has to be ICheckerBoard not CheckerBoard.
    //Java doesn't know dynamic type until runtime

    }
}