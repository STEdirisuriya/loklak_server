/*
 * The MIT License (MIT)
 * ------------------
 * 
 * Copyright (c) 2012-2014 Philipp Nolte
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/*
 * This software was taken from https://github.com/ptnplanet/Java-Naive-Bayes-Classifier
 * and moved to the org.loklak class hierarchy to be enhanced and extended here
 * by @0rb1t3r. The original copyright notice was copied from the README.mnd
 * from https://github.com/ptnplanet/Java-Naive-Bayes-Classifier/blob/master/README.md
 * The original package domain was de.daslaboratorium.machinelearning.classifier
 */

package org.loklak.tools.bayes;

/**
 * Simple interface defining the method to calculate the feature probability.
 *
 * @author Philipp Nolte
 *
 * @param <T> The feature class.
 * @param <K> The category class.
 */
public interface IFeatureProbability<T, K> {

    public float featureProbability(T feature, K category);

}
