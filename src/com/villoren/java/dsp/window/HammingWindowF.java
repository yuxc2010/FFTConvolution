/*
 * HammingWindowF
 *
 * Copyright (c) 2014 Renato Villone
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.villoren.java.dsp.window;

/**
 * Implementation of a Hamming Window.
 *
 * @author Renato Villone
 */
public class HammingWindowF extends AbstractWindowF {

    // Constant
    private static final double PI = Math.PI;
    private static final double PI2 = PI * 2.0;

    private static final double A = 25.0 / 46.0;
    private static final double B = 21.0 / 46.0;

    /**
     * Constructs a Hamming Window for the given number of samples.
     * <p>
     * Size remains constant through the lifetime of this instance.
     *
     * @param size Size of this window.
     */
    public HammingWindowF(int size) {

        super(size);

        // Compute and store window coefficients
        final double M = mSize - 1.0;

        for (int i = 0; i < mSize; i++)
            mWindow[i] = (float) (A - B * Math.cos(PI2 * i / M));
    }
}
