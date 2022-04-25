// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.outputs;

import com.pulumi.azurenative.labservices.outputs.LabDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListGlobalUserLabsResult {
    /**
     * @return List of all the labs
     * 
     */
    private final @Nullable List<LabDetailsResponse> labs;

    @CustomType.Constructor
    private ListGlobalUserLabsResult(@CustomType.Parameter("labs") @Nullable List<LabDetailsResponse> labs) {
        this.labs = labs;
    }

    /**
     * @return List of all the labs
     * 
     */
    public List<LabDetailsResponse> labs() {
        return this.labs == null ? List.of() : this.labs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListGlobalUserLabsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LabDetailsResponse> labs;

        public Builder() {
    	      // Empty
        }

        public Builder(ListGlobalUserLabsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labs = defaults.labs;
        }

        public Builder labs(@Nullable List<LabDetailsResponse> labs) {
            this.labs = labs;
            return this;
        }
        public Builder labs(LabDetailsResponse... labs) {
            return labs(List.of(labs));
        }        public ListGlobalUserLabsResult build() {
            return new ListGlobalUserLabsResult(labs);
        }
    }
}
