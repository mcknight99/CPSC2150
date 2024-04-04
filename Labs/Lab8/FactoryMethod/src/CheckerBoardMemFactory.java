public class CheckerBoardMemFactory implements ICheckerBoardFactory {
    /**
     * Override of ICheckerBoard's method. Used for making strictly GameBoardMems
     *
     * @return a new GameBoardMem
     * @pre none
     * @post makeCheckerBoard = [a new CheckerBoardMem object]
     */
    public ICheckerBoard makeCheckerBoard() { return new CheckerBoardMem(); }
}
