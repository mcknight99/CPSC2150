public interface ICheckerBoardFactory {
    /**
     * Function used by factories for making either CheckerBoard or CheckerBoardMem objects
     *
     * @return either a CheckerBoard or a CheckerBoardMem, depending on dynamic type of factory class
     * @pre none
     * @post makeCheckerBoard = [a new CheckerBoard or CheckerBoardMem object] AND self = #self
     */
    public ICheckerBoard makeCheckerBoard();
}
