// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.OracleRdbmsResponse;
import java.util.Objects;

@OutputCustomType
public final class OracleSourceConfigResponse {
    /**
     * Oracle objects to include in the stream.
     * 
     */
    private final OracleRdbmsResponse allowlist;
    /**
     * Oracle objects to exclude from the stream.
     * 
     */
    private final OracleRdbmsResponse rejectlist;

    @OutputCustomType.Constructor({"allowlist","rejectlist"})
    private OracleSourceConfigResponse(
        OracleRdbmsResponse allowlist,
        OracleRdbmsResponse rejectlist) {
        this.allowlist = Objects.requireNonNull(allowlist);
        this.rejectlist = Objects.requireNonNull(rejectlist);
    }

    /**
     * Oracle objects to include in the stream.
     * 
     */
    public OracleRdbmsResponse getAllowlist() {
        return this.allowlist;
    }
    /**
     * Oracle objects to exclude from the stream.
     * 
     */
    public OracleRdbmsResponse getRejectlist() {
        return this.rejectlist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleRdbmsResponse allowlist;
        private OracleRdbmsResponse rejectlist;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlist = defaults.allowlist;
    	      this.rejectlist = defaults.rejectlist;
        }

        public Builder setAllowlist(OracleRdbmsResponse allowlist) {
            this.allowlist = Objects.requireNonNull(allowlist);
            return this;
        }

        public Builder setRejectlist(OracleRdbmsResponse rejectlist) {
            this.rejectlist = Objects.requireNonNull(rejectlist);
            return this;
        }

        public OracleSourceConfigResponse build() {
            return new OracleSourceConfigResponse(allowlist, rejectlist);
        }
    }
}
