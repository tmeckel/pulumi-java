// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerKeyResult {
    /**
     * @return Key auto rotation opt-in flag. Either true or false.
     * 
     */
    private final Boolean autoRotationEnabled;
    /**
     * @return The server key creation date.
     * 
     */
    private final String creationDate;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    private final String kind;
    /**
     * @return Resource location.
     * 
     */
    private final String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Subregion of the server key.
     * 
     */
    private final String subregion;
    /**
     * @return Thumbprint of the server key.
     * 
     */
    private final String thumbprint;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServerKeyResult(
        @CustomType.Parameter("autoRotationEnabled") Boolean autoRotationEnabled,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("subregion") String subregion,
        @CustomType.Parameter("thumbprint") String thumbprint,
        @CustomType.Parameter("type") String type) {
        this.autoRotationEnabled = autoRotationEnabled;
        this.creationDate = creationDate;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.subregion = subregion;
        this.thumbprint = thumbprint;
        this.type = type;
    }

    /**
     * @return Key auto rotation opt-in flag. Either true or false.
     * 
     */
    public Boolean autoRotationEnabled() {
        return this.autoRotationEnabled;
    }
    /**
     * @return The server key creation date.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Subregion of the server key.
     * 
     */
    public String subregion() {
        return this.subregion;
    }
    /**
     * @return Thumbprint of the server key.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoRotationEnabled;
        private String creationDate;
        private String id;
        private String kind;
        private String location;
        private String name;
        private String subregion;
        private String thumbprint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRotationEnabled = defaults.autoRotationEnabled;
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.subregion = defaults.subregion;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
        }

        public Builder autoRotationEnabled(Boolean autoRotationEnabled) {
            this.autoRotationEnabled = Objects.requireNonNull(autoRotationEnabled);
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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
        public Builder subregion(String subregion) {
            this.subregion = Objects.requireNonNull(subregion);
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServerKeyResult build() {
            return new GetServerKeyResult(autoRotationEnabled, creationDate, id, kind, location, name, subregion, thumbprint, type);
        }
    }
}
