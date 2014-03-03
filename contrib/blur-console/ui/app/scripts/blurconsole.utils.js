/*

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/*global blurconsole:false */
blurconsole.utils = (function(){
	'use strict';
	var inject, unique;

	inject = function(collection, initial, block) {
		if (collection === null || collection.length === 0) {
			return initial;
		}

		var accumulator = initial || collection[0];
		$.each(collection, function(idx, item) {
			accumulator = block(accumulator, item);
		});

		return accumulator;
	};

	unique = function(collection, sort) {
		var uniqueList = [];

		$.each(collection, function(idx, item){
			if (uniqueList.indexOf(item) === -1) {
				uniqueList.push(item);
			}
		});

		if (sort) {
			uniqueList.sort();
		}

		return uniqueList;
	};

	return {
		inject: inject,
		reduce: inject,
		unique: unique
	};
}());