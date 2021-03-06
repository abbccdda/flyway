/**
 * Copyright 2010-2016 Boxfuse GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility methods for dealing with dates.
 */
public class DateUtils {
    /**
     * Prevents instantiation.
     */
    private DateUtils() {
        // Do nothing
    }

    /**
     * Formats this date in the standard ISO format.
     *
     * @param date The date to format.
     * @return The date in ISO format. An empty string if the date is null.
     */
    public static String formatDateAsIsoString(Date date) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
}
