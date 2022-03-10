// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.GetBackendServiceConsistentHashHttpCooky;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetBackendServiceConsistentHash extends io.pulumi.resources.InvokeArgs {

    public static final GetBackendServiceConsistentHash Empty = new GetBackendServiceConsistentHash();

    @InputImport(name="httpCookies", required=true)
      private final List<GetBackendServiceConsistentHashHttpCooky> httpCookies;

    public List<GetBackendServiceConsistentHashHttpCooky> getHttpCookies() {
        return this.httpCookies;
    }

    @InputImport(name="httpHeaderName", required=true)
      private final String httpHeaderName;

    public String getHttpHeaderName() {
        return this.httpHeaderName;
    }

    @InputImport(name="minimumRingSize", required=true)
      private final Integer minimumRingSize;

    public Integer getMinimumRingSize() {
        return this.minimumRingSize;
    }

    public GetBackendServiceConsistentHash(
        List<GetBackendServiceConsistentHashHttpCooky> httpCookies,
        String httpHeaderName,
        Integer minimumRingSize) {
        this.httpCookies = Objects.requireNonNull(httpCookies, "expected parameter 'httpCookies' to be non-null");
        this.httpHeaderName = Objects.requireNonNull(httpHeaderName, "expected parameter 'httpHeaderName' to be non-null");
        this.minimumRingSize = Objects.requireNonNull(minimumRingSize, "expected parameter 'minimumRingSize' to be non-null");
    }

    private GetBackendServiceConsistentHash() {
        this.httpCookies = List.of();
        this.httpHeaderName = null;
        this.minimumRingSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceConsistentHash defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBackendServiceConsistentHashHttpCooky> httpCookies;
        private String httpHeaderName;
        private Integer minimumRingSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceConsistentHash defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpCookies = defaults.httpCookies;
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.minimumRingSize = defaults.minimumRingSize;
        }

        public Builder httpCookies(List<GetBackendServiceConsistentHashHttpCooky> httpCookies) {
            this.httpCookies = Objects.requireNonNull(httpCookies);
            return this;
        }

        public Builder httpHeaderName(String httpHeaderName) {
            this.httpHeaderName = Objects.requireNonNull(httpHeaderName);
            return this;
        }

        public Builder minimumRingSize(Integer minimumRingSize) {
            this.minimumRingSize = Objects.requireNonNull(minimumRingSize);
            return this;
        }
        public GetBackendServiceConsistentHash build() {
            return new GetBackendServiceConsistentHash(httpCookies, httpHeaderName, minimumRingSize);
        }
    }
}
