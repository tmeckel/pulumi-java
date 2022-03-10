// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.InstancePropertiesResponse;
import io.pulumi.googlenative.compute_beta.outputs.SourceInstanceParamsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceTemplateResult {
    /**
     * The creation timestamp for this instance template in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * The resource type, which is always compute#instanceTemplate for instance templates.
     * 
     */
    private final String kind;
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The instance properties for this instance template.
     * 
     */
    private final InstancePropertiesResponse properties;
    /**
     * The URL for this instance template. The server defines this URL.
     * 
     */
    private final String selfLink;
    /**
     * The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    private final String sourceInstance;
    /**
     * The source instance params to use to create this instance template.
     * 
     */
    private final SourceInstanceParamsResponse sourceInstanceParams;

    @OutputCustomType.Constructor
    private GetInstanceTemplateResult(
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("properties") InstancePropertiesResponse properties,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("sourceInstance") String sourceInstance,
        @OutputCustomType.Parameter("sourceInstanceParams") SourceInstanceParamsResponse sourceInstanceParams) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.kind = kind;
        this.name = name;
        this.properties = properties;
        this.selfLink = selfLink;
        this.sourceInstance = sourceInstance;
        this.sourceInstanceParams = sourceInstanceParams;
    }

    /**
     * The creation timestamp for this instance template in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The resource type, which is always compute#instanceTemplate for instance templates.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The instance properties for this instance template.
     * 
    */
    public InstancePropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * The URL for this instance template. The server defines this URL.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
    */
    public String getSourceInstance() {
        return this.sourceInstance;
    }
    /**
     * The source instance params to use to create this instance template.
     * 
    */
    public SourceInstanceParamsResponse getSourceInstanceParams() {
        return this.sourceInstanceParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private InstancePropertiesResponse properties;
        private String selfLink;
        private String sourceInstance;
        private SourceInstanceParamsResponse sourceInstanceParams;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.selfLink = defaults.selfLink;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.sourceInstanceParams = defaults.sourceInstanceParams;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder properties(InstancePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder sourceInstance(String sourceInstance) {
            this.sourceInstance = Objects.requireNonNull(sourceInstance);
            return this;
        }

        public Builder sourceInstanceParams(SourceInstanceParamsResponse sourceInstanceParams) {
            this.sourceInstanceParams = Objects.requireNonNull(sourceInstanceParams);
            return this;
        }
        public GetInstanceTemplateResult build() {
            return new GetInstanceTemplateResult(creationTimestamp, description, kind, name, properties, selfLink, sourceInstance, sourceInstanceParams);
        }
    }
}
