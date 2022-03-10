// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.outputs;

import io.pulumi.azurenative.keyvault.outputs.KeyAttributesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKeyResult {
    /**
     * The attributes of the key.
     * 
     */
    private final @Nullable KeyAttributesResponse attributes;
    /**
     * The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     */
    private final @Nullable String curveName;
    /**
     * Fully qualified identifier of the key vault resource.
     * 
     */
    private final String id;
    private final @Nullable List<String> keyOps;
    /**
     * The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     */
    private final @Nullable Integer keySize;
    /**
     * The URI to retrieve the current version of the key.
     * 
     */
    private final String keyUri;
    /**
     * The URI to retrieve the specific version of the key.
     * 
     */
    private final String keyUriWithVersion;
    /**
     * The type of the key. For valid values, see JsonWebKeyType.
     * 
     */
    private final @Nullable String kty;
    /**
     * Azure location of the key vault resource.
     * 
     */
    private final String location;
    /**
     * Name of the key vault resource.
     * 
     */
    private final String name;
    /**
     * Tags assigned to the key vault resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Resource type of the key vault resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetKeyResult(
        @OutputCustomType.Parameter("attributes") @Nullable KeyAttributesResponse attributes,
        @OutputCustomType.Parameter("curveName") @Nullable String curveName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("keyOps") @Nullable List<String> keyOps,
        @OutputCustomType.Parameter("keySize") @Nullable Integer keySize,
        @OutputCustomType.Parameter("keyUri") String keyUri,
        @OutputCustomType.Parameter("keyUriWithVersion") String keyUriWithVersion,
        @OutputCustomType.Parameter("kty") @Nullable String kty,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.attributes = attributes;
        this.curveName = curveName;
        this.id = id;
        this.keyOps = keyOps;
        this.keySize = keySize;
        this.keyUri = keyUri;
        this.keyUriWithVersion = keyUriWithVersion;
        this.kty = kty;
        this.location = location;
        this.name = name;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The attributes of the key.
     * 
    */
    public Optional<KeyAttributesResponse> getAttributes() {
        return Optional.ofNullable(this.attributes);
    }
    /**
     * The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
    */
    public Optional<String> getCurveName() {
        return Optional.ofNullable(this.curveName);
    }
    /**
     * Fully qualified identifier of the key vault resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<String> getKeyOps() {
        return this.keyOps == null ? List.of() : this.keyOps;
    }
    /**
     * The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
    */
    public Optional<Integer> getKeySize() {
        return Optional.ofNullable(this.keySize);
    }
    /**
     * The URI to retrieve the current version of the key.
     * 
    */
    public String getKeyUri() {
        return this.keyUri;
    }
    /**
     * The URI to retrieve the specific version of the key.
     * 
    */
    public String getKeyUriWithVersion() {
        return this.keyUriWithVersion;
    }
    /**
     * The type of the key. For valid values, see JsonWebKeyType.
     * 
    */
    public Optional<String> getKty() {
        return Optional.ofNullable(this.kty);
    }
    /**
     * Azure location of the key vault resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of the key vault resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Tags assigned to the key vault resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Resource type of the key vault resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyAttributesResponse attributes;
        private @Nullable String curveName;
        private String id;
        private @Nullable List<String> keyOps;
        private @Nullable Integer keySize;
        private String keyUri;
        private String keyUriWithVersion;
        private @Nullable String kty;
        private String location;
        private String name;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.curveName = defaults.curveName;
    	      this.id = defaults.id;
    	      this.keyOps = defaults.keyOps;
    	      this.keySize = defaults.keySize;
    	      this.keyUri = defaults.keyUri;
    	      this.keyUriWithVersion = defaults.keyUriWithVersion;
    	      this.kty = defaults.kty;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder attributes(@Nullable KeyAttributesResponse attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder curveName(@Nullable String curveName) {
            this.curveName = curveName;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder keyOps(@Nullable List<String> keyOps) {
            this.keyOps = keyOps;
            return this;
        }

        public Builder keySize(@Nullable Integer keySize) {
            this.keySize = keySize;
            return this;
        }

        public Builder keyUri(String keyUri) {
            this.keyUri = Objects.requireNonNull(keyUri);
            return this;
        }

        public Builder keyUriWithVersion(String keyUriWithVersion) {
            this.keyUriWithVersion = Objects.requireNonNull(keyUriWithVersion);
            return this;
        }

        public Builder kty(@Nullable String kty) {
            this.kty = kty;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetKeyResult build() {
            return new GetKeyResult(attributes, curveName, id, keyOps, keySize, keyUri, keyUriWithVersion, kty, location, name, tags, type);
        }
    }
}
