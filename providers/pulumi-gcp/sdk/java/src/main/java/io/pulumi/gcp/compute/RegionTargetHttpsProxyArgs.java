// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionTargetHttpsProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionTargetHttpsProxyArgs Empty = new RegionTargetHttpsProxyArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * A list of RegionSslCertificate resources that are used to authenticate
     * connections between users and the load balancer. Currently, exactly
     * one SSL certificate must be specified.
     * 
     */
    @Import(name="sslCertificates", required=true)
      private final Output<List<String>> sslCertificates;

    public Output<List<String>> getSslCertificates() {
        return this.sslCertificates;
    }

    /**
     * A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the RegionBackendService.
     * 
     */
    @Import(name="urlMap", required=true)
      private final Output<String> urlMap;

    public Output<String> getUrlMap() {
        return this.urlMap;
    }

    public RegionTargetHttpsProxyArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        Output<List<String>> sslCertificates,
        Output<String> urlMap) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.region = region;
        this.sslCertificates = Objects.requireNonNull(sslCertificates, "expected parameter 'sslCertificates' to be non-null");
        this.urlMap = Objects.requireNonNull(urlMap, "expected parameter 'urlMap' to be non-null");
    }

    private RegionTargetHttpsProxyArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.sslCertificates = Codegen.empty();
        this.urlMap = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionTargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private Output<List<String>> sslCertificates;
        private Output<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionTargetHttpsProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder sslCertificates(Output<List<String>> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }
        public Builder sslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Output.of(Objects.requireNonNull(sslCertificates));
            return this;
        }
        public Builder sslCertificates(String... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }
        public Builder urlMap(Output<String> urlMap) {
            this.urlMap = Objects.requireNonNull(urlMap);
            return this;
        }
        public Builder urlMap(String urlMap) {
            this.urlMap = Output.of(Objects.requireNonNull(urlMap));
            return this;
        }        public RegionTargetHttpsProxyArgs build() {
            return new RegionTargetHttpsProxyArgs(description, name, project, region, sslCertificates, urlMap);
        }
    }
}
