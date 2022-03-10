// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAddressResult {
    /**
     * The IP of the created resource.
     * 
     */
    private final String address;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String project;
    private final String region;
    /**
     * The URI of the created resource.
     * 
     */
    private final String selfLink;
    /**
     * Indicates if the address is used. Possible values are: RESERVED or IN_USE.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor
    private GetAddressResult(
        @OutputCustomType.Parameter("address") String address,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("project") String project,
        @OutputCustomType.Parameter("region") String region,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("status") String status) {
        this.address = address;
        this.id = id;
        this.name = name;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
        this.status = status;
    }

    /**
     * The IP of the created resource.
     * 
    */
    public String getAddress() {
        return this.address;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProject() {
        return this.project;
    }
    public String getRegion() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Indicates if the address is used. Possible values are: RESERVED or IN_USE.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddressResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String id;
        private String name;
        private String project;
        private String region;
        private String selfLink;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddressResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
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

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetAddressResult build() {
            return new GetAddressResult(address, id, name, project, region, selfLink, status);
        }
    }
}
