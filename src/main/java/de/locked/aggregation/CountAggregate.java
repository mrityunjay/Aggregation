/*
 * Copyright 2013 Dr. Franz Graf.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.locked.aggregation;

public class CountAggregate extends AbstractAggregate {

    private int i = 0;

    public CountAggregate() {
        super(Count.class);
    }
    
    
    @Override
    public void apply(double v) {
        i++;
    }

    @Override
    public void apply(boolean v) {
        i++;
    }

    @Override
    public void apply(char v) {
        i++;
    }

    @Override
    public void apply(Object o) {
        i++;
    }

    @Override
    public double value() {
        return i;
    }

    @Override
    public AbstractAggregate getInstance() {
        return new CountAggregate();
    }
}
