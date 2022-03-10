// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.CommonEncryptionCbcsResponse;
import io.pulumi.azurenative.media.outputs.CommonEncryptionCencResponse;
import io.pulumi.azurenative.media.outputs.EnvelopeEncryptionResponse;
import io.pulumi.azurenative.media.outputs.NoEncryptionResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStreamingPolicyResult {
    /**
     * Configuration of CommonEncryptionCbcs
     * 
     */
    private final @Nullable CommonEncryptionCbcsResponse commonEncryptionCbcs;
    /**
     * Configuration of CommonEncryptionCenc
     * 
     */
    private final @Nullable CommonEncryptionCencResponse commonEncryptionCenc;
    /**
     * Creation time of Streaming Policy
     * 
     */
    private final String created;
    /**
     * Default ContentKey used by current Streaming Policy
     * 
     */
    private final @Nullable String defaultContentKeyPolicyName;
    /**
     * Configuration of EnvelopeEncryption
     * 
     */
    private final @Nullable EnvelopeEncryptionResponse envelopeEncryption;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Configurations of NoEncryption
     * 
     */
    private final @Nullable NoEncryptionResponse noEncryption;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetStreamingPolicyResult(
        @OutputCustomType.Parameter("commonEncryptionCbcs") @Nullable CommonEncryptionCbcsResponse commonEncryptionCbcs,
        @OutputCustomType.Parameter("commonEncryptionCenc") @Nullable CommonEncryptionCencResponse commonEncryptionCenc,
        @OutputCustomType.Parameter("created") String created,
        @OutputCustomType.Parameter("defaultContentKeyPolicyName") @Nullable String defaultContentKeyPolicyName,
        @OutputCustomType.Parameter("envelopeEncryption") @Nullable EnvelopeEncryptionResponse envelopeEncryption,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("noEncryption") @Nullable NoEncryptionResponse noEncryption,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.commonEncryptionCbcs = commonEncryptionCbcs;
        this.commonEncryptionCenc = commonEncryptionCenc;
        this.created = created;
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        this.envelopeEncryption = envelopeEncryption;
        this.id = id;
        this.name = name;
        this.noEncryption = noEncryption;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Configuration of CommonEncryptionCbcs
     * 
    */
    public Optional<CommonEncryptionCbcsResponse> getCommonEncryptionCbcs() {
        return Optional.ofNullable(this.commonEncryptionCbcs);
    }
    /**
     * Configuration of CommonEncryptionCenc
     * 
    */
    public Optional<CommonEncryptionCencResponse> getCommonEncryptionCenc() {
        return Optional.ofNullable(this.commonEncryptionCenc);
    }
    /**
     * Creation time of Streaming Policy
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * Default ContentKey used by current Streaming Policy
     * 
    */
    public Optional<String> getDefaultContentKeyPolicyName() {
        return Optional.ofNullable(this.defaultContentKeyPolicyName);
    }
    /**
     * Configuration of EnvelopeEncryption
     * 
    */
    public Optional<EnvelopeEncryptionResponse> getEnvelopeEncryption() {
        return Optional.ofNullable(this.envelopeEncryption);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Configurations of NoEncryption
     * 
    */
    public Optional<NoEncryptionResponse> getNoEncryption() {
        return Optional.ofNullable(this.noEncryption);
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamingPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CommonEncryptionCbcsResponse commonEncryptionCbcs;
        private @Nullable CommonEncryptionCencResponse commonEncryptionCenc;
        private String created;
        private @Nullable String defaultContentKeyPolicyName;
        private @Nullable EnvelopeEncryptionResponse envelopeEncryption;
        private String id;
        private String name;
        private @Nullable NoEncryptionResponse noEncryption;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonEncryptionCbcs = defaults.commonEncryptionCbcs;
    	      this.commonEncryptionCenc = defaults.commonEncryptionCenc;
    	      this.created = defaults.created;
    	      this.defaultContentKeyPolicyName = defaults.defaultContentKeyPolicyName;
    	      this.envelopeEncryption = defaults.envelopeEncryption;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.noEncryption = defaults.noEncryption;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder commonEncryptionCbcs(@Nullable CommonEncryptionCbcsResponse commonEncryptionCbcs) {
            this.commonEncryptionCbcs = commonEncryptionCbcs;
            return this;
        }

        public Builder commonEncryptionCenc(@Nullable CommonEncryptionCencResponse commonEncryptionCenc) {
            this.commonEncryptionCenc = commonEncryptionCenc;
            return this;
        }

        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder defaultContentKeyPolicyName(@Nullable String defaultContentKeyPolicyName) {
            this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
            return this;
        }

        public Builder envelopeEncryption(@Nullable EnvelopeEncryptionResponse envelopeEncryption) {
            this.envelopeEncryption = envelopeEncryption;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder noEncryption(@Nullable NoEncryptionResponse noEncryption) {
            this.noEncryption = noEncryption;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetStreamingPolicyResult build() {
            return new GetStreamingPolicyResult(commonEncryptionCbcs, commonEncryptionCenc, created, defaultContentKeyPolicyName, envelopeEncryption, id, name, noEncryption, systemData, type);
        }
    }
}
