// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.inputs.InterconnectMacsecPreSharedKeyArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration information for enabling Media Access Control security (Macsec) on this Interconnect between Google and your on-premises router.
 * 
 */
public final class InterconnectMacsecArgs extends io.pulumi.resources.ResourceArgs {

    public static final InterconnectMacsecArgs Empty = new InterconnectMacsecArgs();

    /**
     * If set to true, the Interconnect will be configured with a should-secure MACsec security policy, that allows the Google router to fallback to cleartext traffic if the MKA session cannot be established. By default, the Interconnect will be configured with a must-secure security policy that drops all traffic if the MKA session cannot be established with your router.
     * 
     */
    @Import(name="failOpen")
      private final @Nullable Output<Boolean> failOpen;

    public Output<Boolean> getFailOpen() {
        return this.failOpen == null ? Codegen.empty() : this.failOpen;
    }

    /**
     * A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK will be generated for each key in the key chain. Google router will automatically pick the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
     * 
     */
    @Import(name="preSharedKeys", required=true)
      private final Output<List<InterconnectMacsecPreSharedKeyArgs>> preSharedKeys;

    public Output<List<InterconnectMacsecPreSharedKeyArgs>> getPreSharedKeys() {
        return this.preSharedKeys;
    }

    public InterconnectMacsecArgs(
        @Nullable Output<Boolean> failOpen,
        Output<List<InterconnectMacsecPreSharedKeyArgs>> preSharedKeys) {
        this.failOpen = failOpen;
        this.preSharedKeys = Objects.requireNonNull(preSharedKeys, "expected parameter 'preSharedKeys' to be non-null");
    }

    private InterconnectMacsecArgs() {
        this.failOpen = Codegen.empty();
        this.preSharedKeys = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectMacsecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> failOpen;
        private Output<List<InterconnectMacsecPreSharedKeyArgs>> preSharedKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectMacsecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failOpen = defaults.failOpen;
    	      this.preSharedKeys = defaults.preSharedKeys;
        }

        public Builder failOpen(@Nullable Output<Boolean> failOpen) {
            this.failOpen = failOpen;
            return this;
        }
        public Builder failOpen(@Nullable Boolean failOpen) {
            this.failOpen = Codegen.ofNullable(failOpen);
            return this;
        }
        public Builder preSharedKeys(Output<List<InterconnectMacsecPreSharedKeyArgs>> preSharedKeys) {
            this.preSharedKeys = Objects.requireNonNull(preSharedKeys);
            return this;
        }
        public Builder preSharedKeys(List<InterconnectMacsecPreSharedKeyArgs> preSharedKeys) {
            this.preSharedKeys = Output.of(Objects.requireNonNull(preSharedKeys));
            return this;
        }
        public Builder preSharedKeys(InterconnectMacsecPreSharedKeyArgs... preSharedKeys) {
            return preSharedKeys(List.of(preSharedKeys));
        }        public InterconnectMacsecArgs build() {
            return new InterconnectMacsecArgs(failOpen, preSharedKeys);
        }
    }
}
