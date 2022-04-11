// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An NS record.
 * 
 */
public final class NsRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final NsRecordArgs Empty = new NsRecordArgs();

    /**
     * The name server name for this NS record.
     * 
     */
    @Import(name="nsdname")
      private final @Nullable Output<String> nsdname;

    public Output<String> getNsdname() {
        return this.nsdname == null ? Codegen.empty() : this.nsdname;
    }

    public NsRecordArgs(@Nullable Output<String> nsdname) {
        this.nsdname = nsdname;
    }

    private NsRecordArgs() {
        this.nsdname = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NsRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> nsdname;

        public Builder() {
    	      // Empty
        }

        public Builder(NsRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nsdname = defaults.nsdname;
        }

        public Builder nsdname(@Nullable Output<String> nsdname) {
            this.nsdname = nsdname;
            return this;
        }
        public Builder nsdname(@Nullable String nsdname) {
            this.nsdname = Codegen.ofNullable(nsdname);
            return this;
        }        public NsRecordArgs build() {
            return new NsRecordArgs(nsdname);
        }
    }
}
