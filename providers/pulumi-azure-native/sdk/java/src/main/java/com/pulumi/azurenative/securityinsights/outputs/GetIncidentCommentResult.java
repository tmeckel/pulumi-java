// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.azurenative.securityinsights.outputs.ClientInfoResponse;
import com.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIncidentCommentResult {
    /**
     * @return Describes the client that created the comment
     * 
     */
    private final ClientInfoResponse author;
    /**
     * @return The time the comment was created
     * 
     */
    private final String createdTimeUtc;
    /**
     * @return Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Azure resource Id
     * 
     */
    private final String id;
    /**
     * @return The time the comment was updated
     * 
     */
    private final String lastModifiedTimeUtc;
    /**
     * @return The comment message
     * 
     */
    private final String message;
    /**
     * @return Azure resource name
     * 
     */
    private final String name;
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIncidentCommentResult(
        @CustomType.Parameter("author") ClientInfoResponse author,
        @CustomType.Parameter("createdTimeUtc") String createdTimeUtc,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedTimeUtc") String lastModifiedTimeUtc,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.author = author;
        this.createdTimeUtc = createdTimeUtc;
        this.etag = etag;
        this.id = id;
        this.lastModifiedTimeUtc = lastModifiedTimeUtc;
        this.message = message;
        this.name = name;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Describes the client that created the comment
     * 
     */
    public ClientInfoResponse author() {
        return this.author;
    }
    /**
     * @return The time the comment was created
     * 
     */
    public String createdTimeUtc() {
        return this.createdTimeUtc;
    }
    /**
     * @return Etag of the azure resource
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Azure resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The time the comment was updated
     * 
     */
    public String lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    /**
     * @return The comment message
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Azure resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIncidentCommentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientInfoResponse author;
        private String createdTimeUtc;
        private @Nullable String etag;
        private String id;
        private String lastModifiedTimeUtc;
        private String message;
        private String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIncidentCommentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.createdTimeUtc = defaults.createdTimeUtc;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.lastModifiedTimeUtc = defaults.lastModifiedTimeUtc;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder author(ClientInfoResponse author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }
        public Builder createdTimeUtc(String createdTimeUtc) {
            this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc);
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
        public Builder lastModifiedTimeUtc(String lastModifiedTimeUtc) {
            this.lastModifiedTimeUtc = Objects.requireNonNull(lastModifiedTimeUtc);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIncidentCommentResult build() {
            return new GetIncidentCommentResult(author, createdTimeUtc, etag, id, lastModifiedTimeUtc, message, name, systemData, type);
        }
    }
}
