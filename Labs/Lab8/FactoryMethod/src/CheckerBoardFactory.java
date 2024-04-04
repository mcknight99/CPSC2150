public class CheckerBoardFactory implements ICheckerBoardFactory {

    /**
     * Override of ICheckerBoard's method. Used for making strictly CheckerBoards
     *
     * @return a new CheckerBoard
     * @pre none
     * @post makeCheckerBoard = [a new CheckerBoard object]
     */
    public ICheckerBoard makeCheckerBoard() { return new CheckerBoard(); }
}
