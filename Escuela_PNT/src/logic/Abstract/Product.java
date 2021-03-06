/*
 * Copyright (C) 2020 FacuFalcone - CaidevOficial
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package logic.Abstract;

/**
 * @author FacuFalcone - CaidevOficial
 */
public abstract class Product implements Comparable<Product> {

    // Attributes
    protected String name;
    protected int price;
    

    public abstract int getPrice();
    public abstract String getName();
    
    @Override
    public abstract String toString();

    @Override
    /**
     * Compares the prices of the actual product with another one.
     * 
     * @return A negative number if the this.price is smaller than arg0.price, else return a positive number or zero if equal..
     */
    public int compareTo(Product arg0) {
	   int result = this.getPrice() - arg0.getPrice();
	   return result;
    }
}
