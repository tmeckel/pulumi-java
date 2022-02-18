// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The unique identifier of the update.
 * 
 */
public final class IdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityResponse Empty = new IdentityResponse();

    /**
     * The revision number of the update.
     * 
     */
    @InputImport(name="revision", required=true)
    private final Integer revision;

    public Integer getRevision() {
        return this.revision;
    }

    /**
     * The revision independent identifier of the update.
     * 
     */
    @InputImport(name="updateId", required=true)
    private final String updateId;

    public String getUpdateId() {
        return this.updateId;
    }

    public IdentityResponse(
        Integer revision,
        String updateId) {
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
        this.updateId = Objects.requireNonNull(updateId, "expected parameter 'updateId' to be non-null");
    }

    private IdentityResponse() {
        this.revision = null;
        this.updateId = null;
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

        public Builder setRevision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder setUpdateId(String updateId) {
            this.updateId = Objects.requireNonNull(updateId);
            return this;
        }

        public IdentityResponse build() {
            return new IdentityResponse(revision, updateId);
        }
    }
}
