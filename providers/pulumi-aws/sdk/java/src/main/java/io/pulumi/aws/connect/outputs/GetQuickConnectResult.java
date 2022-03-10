// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.aws.connect.outputs.GetQuickConnectQuickConnectConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetQuickConnectResult {
    /**
     * The Amazon Resource Name (ARN) of the Quick Connect.
     * 
     */
    private final String arn;
    /**
     * Specifies the description of the Quick Connect.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceId;
    private final String name;
    /**
     * A block that defines the configuration information for the Quick Connect: `quick_connect_type` and one of `phone_config`, `queue_config`, `user_config` . The Quick Connect Config block is documented below.
     * 
     */
    private final List<GetQuickConnectQuickConnectConfig> quickConnectConfigs;
    /**
     * The identifier for the Quick Connect.
     * 
     */
    private final String quickConnectId;
    /**
     * A map of tags to assign to the Quick Connect.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetQuickConnectResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("instanceId") String instanceId,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("quickConnectConfigs") List<GetQuickConnectQuickConnectConfig> quickConnectConfigs,
        @OutputCustomType.Parameter("quickConnectId") String quickConnectId,
        @OutputCustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.instanceId = instanceId;
        this.name = name;
        this.quickConnectConfigs = quickConnectConfigs;
        this.quickConnectId = quickConnectId;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the Quick Connect.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Specifies the description of the Quick Connect.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getInstanceId() {
        return this.instanceId;
    }
    public String getName() {
        return this.name;
    }
    /**
     * A block that defines the configuration information for the Quick Connect: `quick_connect_type` and one of `phone_config`, `queue_config`, `user_config` . The Quick Connect Config block is documented below.
     * 
    */
    public List<GetQuickConnectQuickConnectConfig> getQuickConnectConfigs() {
        return this.quickConnectConfigs;
    }
    /**
     * The identifier for the Quick Connect.
     * 
    */
    public String getQuickConnectId() {
        return this.quickConnectId;
    }
    /**
     * A map of tags to assign to the Quick Connect.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuickConnectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private String instanceId;
        private String name;
        private List<GetQuickConnectQuickConnectConfig> quickConnectConfigs;
        private String quickConnectId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuickConnectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.quickConnectConfigs = defaults.quickConnectConfigs;
    	      this.quickConnectId = defaults.quickConnectId;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder quickConnectConfigs(List<GetQuickConnectQuickConnectConfig> quickConnectConfigs) {
            this.quickConnectConfigs = Objects.requireNonNull(quickConnectConfigs);
            return this;
        }

        public Builder quickConnectId(String quickConnectId) {
            this.quickConnectId = Objects.requireNonNull(quickConnectId);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetQuickConnectResult build() {
            return new GetQuickConnectResult(arn, description, id, instanceId, name, quickConnectConfigs, quickConnectId, tags);
        }
    }
}
