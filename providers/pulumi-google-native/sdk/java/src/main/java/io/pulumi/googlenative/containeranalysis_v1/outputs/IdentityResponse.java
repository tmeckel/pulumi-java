// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IdentityResponse {
    /**
     * The revision number of the update.
     * 
     */
    private final Integer revision;
    /**
     * The revision independent identifier of the update.
     * 
     */
    private final String updateId;

    @OutputCustomType.Constructor
    private IdentityResponse(
        @OutputCustomType.Parameter("revision") Integer revision,
        @OutputCustomType.Parameter("updateId") String updateId) {
        this.revision = revision;
        this.updateId = updateId;
    }

    /**
     * The revision number of the update.
     * 
    */
    public Integer getRevision() {
        return this.revision;
    }
    /**
     * The revision independent identifier of the update.
     * 
    */
    public String getUpdateId() {
        return this.updateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer revision;
        private String updateId;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revision = defaults.revision;
    	      this.updateId = defaults.updateId;
        }

        public Builder revision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder updateId(String updateId) {
            this.updateId = Objects.requireNonNull(updateId);
            return this;
        }
        public IdentityResponse build() {
            return new IdentityResponse(revision, updateId);
        }
    }
}
