// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Intrinsic settings which refers to the type of the StorSimple Manager.
 * 
 */
public final class ManagerIntrinsicSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagerIntrinsicSettingsResponse Empty = new ManagerIntrinsicSettingsResponse();

    /**
     * The type of StorSimple Manager.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ManagerIntrinsicSettingsResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagerIntrinsicSettingsResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagerIntrinsicSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagerIntrinsicSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagerIntrinsicSettingsResponse build() {
            return new ManagerIntrinsicSettingsResponse(type);
        }
    }
}
