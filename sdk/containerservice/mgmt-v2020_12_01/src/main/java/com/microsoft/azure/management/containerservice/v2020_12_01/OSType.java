/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OSType.
 */
public final class OSType extends ExpandableStringEnum<OSType> {
    /** Static value Linux for OSType. */
    public static final OSType LINUX = fromString("Linux");

    /** Static value Windows for OSType. */
    public static final OSType WINDOWS = fromString("Windows");

    /**
     * Creates or finds a OSType from its string representation.
     * @param name a name to look for
     * @return the corresponding OSType
     */
    @JsonCreator
    public static OSType fromString(String name) {
        return fromString(name, OSType.class);
    }

    /**
     * @return known OSType values
     */
    public static Collection<OSType> values() {
        return values(OSType.class);
    }
}
