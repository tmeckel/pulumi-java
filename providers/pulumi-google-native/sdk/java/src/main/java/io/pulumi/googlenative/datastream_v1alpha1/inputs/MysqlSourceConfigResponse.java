// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlRdbmsResponse;
import java.util.Objects;


/**
 * MySQL source configuration
 * 
 */
public final class MysqlSourceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final MysqlSourceConfigResponse Empty = new MysqlSourceConfigResponse();

    /**
     * MySQL objects to retrieve from the source.
     * 
     */
    @InputImport(name="allowlist", required=true)
      private final MysqlRdbmsResponse allowlist;

    public MysqlRdbmsResponse getAllowlist() {
        return this.allowlist;
    }

    /**
     * MySQL objects to exclude from the stream.
     * 
     */
    @InputImport(name="rejectlist", required=true)
      private final MysqlRdbmsResponse rejectlist;

    public MysqlRdbmsResponse getRejectlist() {
        return this.rejectlist;
    }

    public MysqlSourceConfigResponse(
        MysqlRdbmsResponse allowlist,
        MysqlRdbmsResponse rejectlist) {
        this.allowlist = Objects.requireNonNull(allowlist, "expected parameter 'allowlist' to be non-null");
        this.rejectlist = Objects.requireNonNull(rejectlist, "expected parameter 'rejectlist' to be non-null");
    }

    private MysqlSourceConfigResponse() {
        this.allowlist = null;
        this.rejectlist = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlSourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlRdbmsResponse allowlist;
        private MysqlRdbmsResponse rejectlist;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlSourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlist = defaults.allowlist;
    	      this.rejectlist = defaults.rejectlist;
        }

        public Builder allowlist(MysqlRdbmsResponse allowlist) {
            this.allowlist = Objects.requireNonNull(allowlist);
            return this;
        }

        public Builder rejectlist(MysqlRdbmsResponse rejectlist) {
            this.rejectlist = Objects.requireNonNull(rejectlist);
            return this;
        }
        public MysqlSourceConfigResponse build() {
            return new MysqlSourceConfigResponse(allowlist, rejectlist);
        }
    }
}
