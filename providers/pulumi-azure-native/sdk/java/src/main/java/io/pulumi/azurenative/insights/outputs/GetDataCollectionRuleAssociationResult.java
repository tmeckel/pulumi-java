// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataCollectionRuleAssociationResult {
    /**
     * The resource ID of the data collection rule that is to be associated.
     * 
     */
    private final @Nullable String dataCollectionRuleId;
    /**
     * Description of the association.
     * 
     */
    private final @Nullable String description;
    /**
     * Resource entity tag (ETag).
     * 
     */
    private final String etag;
    /**
     * Fully qualified ID of the resource.
     * 
     */
    private final String id;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The resource provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetDataCollectionRuleAssociationResult(
        @OutputCustomType.Parameter("dataCollectionRuleId") @Nullable String dataCollectionRuleId,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("type") String type) {
        this.dataCollectionRuleId = dataCollectionRuleId;
        this.description = description;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * The resource ID of the data collection rule that is to be associated.
     * 
    */
    public Optional<String> getDataCollectionRuleId() {
        return Optional.ofNullable(this.dataCollectionRuleId);
    }
    /**
     * Description of the association.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Resource entity tag (ETag).
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Fully qualified ID of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataCollectionRuleId;
        private @Nullable String description;
        private String etag;
        private String id;
        private String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectionRuleAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCollectionRuleId = defaults.dataCollectionRuleId;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder dataCollectionRuleId(@Nullable String dataCollectionRuleId) {
            this.dataCollectionRuleId = dataCollectionRuleId;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDataCollectionRuleAssociationResult build() {
            return new GetDataCollectionRuleAssociationResult(dataCollectionRuleId, description, etag, id, name, provisioningState, type);
        }
    }
}
