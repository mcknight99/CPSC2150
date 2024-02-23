/**
 * Rectangle.java represents a stand rectangle shape, with a length, width, and area
 * all as a float.
 */
public class Rectangle
{
    private float length;
    private float width;
    private float area;


    /**
     * constructs a rectangle object based on the two parameters, aLength, aWidth.
     * @param aLength the value to be set to length, a float.
     * @param aWidth the value to be set to width, a float.
     *
     * @pre aLength > 0 AND aWidth > 0
     *
     * @post length = aLength AND width = aWidth AND area = length * width
     */
    public Rectangle(float aLength, float aWidth)
    {
        this.length = aLength;
        this.width = aWidth;
        this.area = this.length * this.width;
    }


    /**
     * standard getter for length
     * @return the length of the rectangle as a float
     *
     * @pre none
     *
     * @post getLength = length AND length = #length AND width = #width AND area = #area
     */
    public float getLength()
    {
        return this.length;
    }

    /**
     * Sets the length of the rectangle object from parameter aLength
     * @param aLength set the rectangle length to this value. A float.
     * 
     * @return none
     * 
     * @pre aLength > 0
     * @post length = aLength AND area = length * width
     */
    public void setLength(float aLength)
    {
        this.length = aLength;
        updateArea();
    }

    /**
     * Recalculates the area of the rectangle using the current values for length and width
     * @return none
     * 
     * @pre none
     * 
     * @post area = length * width
     */
    public void updateArea()
    {
        this.area = this.length * this.width;
    }

    /**
     * Returns the area of the rectangle after updating the area
     * 
     * @return the area of the rectangle. A float.
     * 
     * @pre none
     * 
     * @post getArea = area
     */
    public float getArea()
    {
        updateArea(); //to ensure most recent values are calculated
        return this.area;
    }

    /**
     * Returns the rectangle object as a string, overrides toString() in Object
     * 
     * @return a text description of the rectangle object
     * 
     * @pre none
     * 
     * @post toString = the text description of the rectangle object
     */
    public String toString()
    {
        return "Length = " + this.length + ", Width = " + this.width + ", Area = " + this.area + ".\n";
    }


}
