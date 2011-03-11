/*
 * Copyright (C) 2011 Near Infinity Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nearinfinity.blur.manager.hits;

import java.util.Comparator;

import com.nearinfinity.blur.thrift.generated.Hit;

public class HitsPeekableIteratorComparator implements Comparator<PeekableIterator<Hit>> {

    @Override
    public int compare(PeekableIterator<Hit> o1, PeekableIterator<Hit> o2) {
        Hit hit1 = o1.peek();
        Hit hit2 = o2.peek();
        if (hit1 == null && hit2 == null) {
            return 0;
        } else if (hit1 == null) {
            return 1;
        } else if (hit2 == null) {
            return -1;
        }
        int compare = Double.compare(hit2.score, hit1.score);
        if (compare == 0) {
            return hit2.locationId.compareTo(hit1.locationId);
        }
        return compare;
    }

}