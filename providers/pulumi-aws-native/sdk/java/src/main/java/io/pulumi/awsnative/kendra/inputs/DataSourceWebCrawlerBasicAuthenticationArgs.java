// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceWebCrawlerBasicAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceWebCrawlerBasicAuthenticationArgs Empty = new DataSourceWebCrawlerBasicAuthenticationArgs();

    @InputImport(name="credentials", required=true)
      private final Input<String> credentials;

    public Input<String> getCredentials() {
        return this.credentials;
    }

    @InputImport(name="host", required=true)
      private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    @InputImport(name="port", required=true)
      private final Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port;
    }

    public DataSourceWebCrawlerBasicAuthenticationArgs(
        Input<String> credentials,
        Input<String> host,
        Input<Integer> port) {
        this.credentials = Objects.requireNonNull(credentials, "expected parameter 'credentials' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceWebCrawlerBasicAuthenticationArgs() {
        this.credentials = Input.empty();
        this.host = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerBasicAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> credentials;
        private Input<String> host;
        private Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerBasicAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder credentials(Input<String> credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }

        public Builder credentials(String credentials) {
            this.credentials = Input.of(Objects.requireNonNull(credentials));
            return this;
        }

        public Builder host(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder host(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder port(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }
        public DataSourceWebCrawlerBasicAuthenticationArgs build() {
            return new DataSourceWebCrawlerBasicAuthenticationArgs(credentials, host, port);
        }
    }
}
