// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlRdbmsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MySQL source configuration
 * 
 */
public final class MysqlSourceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlSourceConfigArgs Empty = new MysqlSourceConfigArgs();

    /**
     * MySQL objects to retrieve from the source.
     * 
     */
    @Import(name="allowlist")
      private final @Nullable Output<MysqlRdbmsArgs> allowlist;

    public Output<MysqlRdbmsArgs> getAllowlist() {
        return this.allowlist == null ? Codegen.empty() : this.allowlist;
    }

    /**
     * MySQL objects to exclude from the stream.
     * 
     */
    @Import(name="rejectlist")
      private final @Nullable Output<MysqlRdbmsArgs> rejectlist;

    public Output<MysqlRdbmsArgs> getRejectlist() {
        return this.rejectlist == null ? Codegen.empty() : this.rejectlist;
    }

    public MysqlSourceConfigArgs(
        @Nullable Output<MysqlRdbmsArgs> allowlist,
        @Nullable Output<MysqlRdbmsArgs> rejectlist) {
        this.allowlist = allowlist;
        this.rejectlist = rejectlist;
    }

    private MysqlSourceConfigArgs() {
        this.allowlist = Codegen.empty();
        this.rejectlist = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MysqlRdbmsArgs> allowlist;
        private @Nullable Output<MysqlRdbmsArgs> rejectlist;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlSourceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlist = defaults.allowlist;
    	      this.rejectlist = defaults.rejectlist;
        }

        public Builder allowlist(@Nullable Output<MysqlRdbmsArgs> allowlist) {
            this.allowlist = allowlist;
            return this;
        }
        public Builder allowlist(@Nullable MysqlRdbmsArgs allowlist) {
            this.allowlist = Codegen.ofNullable(allowlist);
            return this;
        }
        public Builder rejectlist(@Nullable Output<MysqlRdbmsArgs> rejectlist) {
            this.rejectlist = rejectlist;
            return this;
        }
        public Builder rejectlist(@Nullable MysqlRdbmsArgs rejectlist) {
            this.rejectlist = Codegen.ofNullable(rejectlist);
            return this;
        }        public MysqlSourceConfigArgs build() {
            return new MysqlSourceConfigArgs(allowlist, rejectlist);
        }
    }
}
