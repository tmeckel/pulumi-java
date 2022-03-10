// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyCookiesConfig;
import io.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyHeadersConfig;
import io.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyQueryStringsConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOriginRequestPolicyResult {
    /**
     * Comment to describe the origin request policy.
     * 
     */
    private final String comment;
    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    private final List<GetOriginRequestPolicyCookiesConfig> cookiesConfigs;
    /**
     * The current version of the origin request policy.
     * 
     */
    private final String etag;
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    private final List<GetOriginRequestPolicyHeadersConfig> headersConfigs;
    private final @Nullable String id;
    private final @Nullable String name;
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    private final List<GetOriginRequestPolicyQueryStringsConfig> queryStringsConfigs;

    @OutputCustomType.Constructor
    private GetOriginRequestPolicyResult(
        @OutputCustomType.Parameter("comment") String comment,
        @OutputCustomType.Parameter("cookiesConfigs") List<GetOriginRequestPolicyCookiesConfig> cookiesConfigs,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("headersConfigs") List<GetOriginRequestPolicyHeadersConfig> headersConfigs,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("queryStringsConfigs") List<GetOriginRequestPolicyQueryStringsConfig> queryStringsConfigs) {
        this.comment = comment;
        this.cookiesConfigs = cookiesConfigs;
        this.etag = etag;
        this.headersConfigs = headersConfigs;
        this.id = id;
        this.name = name;
        this.queryStringsConfigs = queryStringsConfigs;
    }

    /**
     * Comment to describe the origin request policy.
     * 
    */
    public String getComment() {
        return this.comment;
    }
    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
    */
    public List<GetOriginRequestPolicyCookiesConfig> getCookiesConfigs() {
        return this.cookiesConfigs;
    }
    /**
     * The current version of the origin request policy.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
    */
    public List<GetOriginRequestPolicyHeadersConfig> getHeadersConfigs() {
        return this.headersConfigs;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
    */
    public List<GetOriginRequestPolicyQueryStringsConfig> getQueryStringsConfigs() {
        return this.queryStringsConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginRequestPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;
        private List<GetOriginRequestPolicyCookiesConfig> cookiesConfigs;
        private String etag;
        private List<GetOriginRequestPolicyHeadersConfig> headersConfigs;
        private @Nullable String id;
        private @Nullable String name;
        private List<GetOriginRequestPolicyQueryStringsConfig> queryStringsConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginRequestPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.cookiesConfigs = defaults.cookiesConfigs;
    	      this.etag = defaults.etag;
    	      this.headersConfigs = defaults.headersConfigs;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.queryStringsConfigs = defaults.queryStringsConfigs;
        }

        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder cookiesConfigs(List<GetOriginRequestPolicyCookiesConfig> cookiesConfigs) {
            this.cookiesConfigs = Objects.requireNonNull(cookiesConfigs);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder headersConfigs(List<GetOriginRequestPolicyHeadersConfig> headersConfigs) {
            this.headersConfigs = Objects.requireNonNull(headersConfigs);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder queryStringsConfigs(List<GetOriginRequestPolicyQueryStringsConfig> queryStringsConfigs) {
            this.queryStringsConfigs = Objects.requireNonNull(queryStringsConfigs);
            return this;
        }
        public GetOriginRequestPolicyResult build() {
            return new GetOriginRequestPolicyResult(comment, cookiesConfigs, etag, headersConfigs, id, name, queryStringsConfigs);
        }
    }
}
