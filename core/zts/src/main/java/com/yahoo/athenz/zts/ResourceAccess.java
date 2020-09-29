//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yahoo.rdl.*;

//
// ResourceAccess - ResourceAccess can be checked and returned as this
// resource. (same as ZMS.Access)
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceAccess {
    public boolean granted;

    public ResourceAccess setGranted(boolean granted) {
        this.granted = granted;
        return this;
    }
    public boolean getGranted() {
        return granted;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != ResourceAccess.class) {
                return false;
            }
            ResourceAccess a = (ResourceAccess) another;
            if (granted != a.granted) {
                return false;
            }
        }
        return true;
    }
}