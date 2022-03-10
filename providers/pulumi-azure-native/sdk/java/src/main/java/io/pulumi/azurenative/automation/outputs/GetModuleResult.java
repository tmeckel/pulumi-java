// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.ContentLinkResponse;
import io.pulumi.azurenative.automation.outputs.ModuleErrorInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetModuleResult {
    /**
     * Gets or sets the activity count of the module.
     * 
     */
    private final @Nullable Integer activityCount;
    /**
     * Gets or sets the contentLink of the module.
     * 
     */
    private final @Nullable ContentLinkResponse contentLink;
    /**
     * Gets or sets the creation time.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * Gets or sets the error info of the module.
     * 
     */
    private final @Nullable ModuleErrorInfoResponse error;
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * Gets or sets type of module, if its composite or not.
     * 
     */
    private final @Nullable Boolean isComposite;
    /**
     * Gets or sets the isGlobal flag of the module.
     * 
     */
    private final @Nullable Boolean isGlobal;
    /**
     * Gets or sets the last modified time.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * The Azure Region where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the provisioning state of the module.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Gets or sets the size in bytes of the module.
     * 
     */
    private final @Nullable Double sizeInBytes;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * Gets or sets the version of the module.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private GetModuleResult(
        @OutputCustomType.Parameter("activityCount") @Nullable Integer activityCount,
        @OutputCustomType.Parameter("contentLink") @Nullable ContentLinkResponse contentLink,
        @OutputCustomType.Parameter("creationTime") @Nullable String creationTime,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("error") @Nullable ModuleErrorInfoResponse error,
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("isComposite") @Nullable Boolean isComposite,
        @OutputCustomType.Parameter("isGlobal") @Nullable Boolean isGlobal,
        @OutputCustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("sizeInBytes") @Nullable Double sizeInBytes,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.activityCount = activityCount;
        this.contentLink = contentLink;
        this.creationTime = creationTime;
        this.description = description;
        this.error = error;
        this.etag = etag;
        this.id = id;
        this.isComposite = isComposite;
        this.isGlobal = isGlobal;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sizeInBytes = sizeInBytes;
        this.tags = tags;
        this.type = type;
        this.version = version;
    }

    /**
     * Gets or sets the activity count of the module.
     * 
    */
    public Optional<Integer> getActivityCount() {
        return Optional.ofNullable(this.activityCount);
    }
    /**
     * Gets or sets the contentLink of the module.
     * 
    */
    public Optional<ContentLinkResponse> getContentLink() {
        return Optional.ofNullable(this.contentLink);
    }
    /**
     * Gets or sets the creation time.
     * 
    */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * Gets or sets the description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Gets or sets the error info of the module.
     * 
    */
    public Optional<ModuleErrorInfoResponse> getError() {
        return Optional.ofNullable(this.error);
    }
    /**
     * Gets or sets the etag of the resource.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Fully qualified resource Id for the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets type of module, if its composite or not.
     * 
    */
    public Optional<Boolean> getIsComposite() {
        return Optional.ofNullable(this.isComposite);
    }
    /**
     * Gets or sets the isGlobal flag of the module.
     * 
    */
    public Optional<Boolean> getIsGlobal() {
        return Optional.ofNullable(this.isGlobal);
    }
    /**
     * Gets or sets the last modified time.
     * 
    */
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * The Azure Region where the resource lives
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state of the module.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Gets or sets the size in bytes of the module.
     * 
    */
    public Optional<Double> getSizeInBytes() {
        return Optional.ofNullable(this.sizeInBytes);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets the version of the module.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer activityCount;
        private @Nullable ContentLinkResponse contentLink;
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable ModuleErrorInfoResponse error;
        private @Nullable String etag;
        private String id;
        private @Nullable Boolean isComposite;
        private @Nullable Boolean isGlobal;
        private @Nullable String lastModifiedTime;
        private @Nullable String location;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable Double sizeInBytes;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activityCount = defaults.activityCount;
    	      this.contentLink = defaults.contentLink;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.error = defaults.error;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.isComposite = defaults.isComposite;
    	      this.isGlobal = defaults.isGlobal;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder activityCount(@Nullable Integer activityCount) {
            this.activityCount = activityCount;
            return this;
        }

        public Builder contentLink(@Nullable ContentLinkResponse contentLink) {
            this.contentLink = contentLink;
            return this;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder error(@Nullable ModuleErrorInfoResponse error) {
            this.error = error;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isComposite(@Nullable Boolean isComposite) {
            this.isComposite = isComposite;
            return this;
        }

        public Builder isGlobal(@Nullable Boolean isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder sizeInBytes(@Nullable Double sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetModuleResult build() {
            return new GetModuleResult(activityCount, contentLink, creationTime, description, error, etag, id, isComposite, isGlobal, lastModifiedTime, location, name, provisioningState, sizeInBytes, tags, type, version);
        }
    }
}
