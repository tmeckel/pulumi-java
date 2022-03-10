// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorTestGroupResponse {
    /**
     * List of destination endpoint names.
     * 
     */
    private final List<String> destinations;
    /**
     * Value indicating whether test group is disabled.
     * 
     */
    private final @Nullable Boolean disable;
    /**
     * The name of the connection monitor test group.
     * 
     */
    private final String name;
    /**
     * List of source endpoint names.
     * 
     */
    private final List<String> sources;
    /**
     * List of test configuration names.
     * 
     */
    private final List<String> testConfigurations;

    @OutputCustomType.Constructor
    private ConnectionMonitorTestGroupResponse(
        @OutputCustomType.Parameter("destinations") List<String> destinations,
        @OutputCustomType.Parameter("disable") @Nullable Boolean disable,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("sources") List<String> sources,
        @OutputCustomType.Parameter("testConfigurations") List<String> testConfigurations) {
        this.destinations = destinations;
        this.disable = disable;
        this.name = name;
        this.sources = sources;
        this.testConfigurations = testConfigurations;
    }

    /**
     * List of destination endpoint names.
     * 
    */
    public List<String> getDestinations() {
        return this.destinations;
    }
    /**
     * Value indicating whether test group is disabled.
     * 
    */
    public Optional<Boolean> getDisable() {
        return Optional.ofNullable(this.disable);
    }
    /**
     * The name of the connection monitor test group.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of source endpoint names.
     * 
    */
    public List<String> getSources() {
        return this.sources;
    }
    /**
     * List of test configuration names.
     * 
    */
    public List<String> getTestConfigurations() {
        return this.testConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorTestGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destinations;
        private @Nullable Boolean disable;
        private String name;
        private List<String> sources;
        private List<String> testConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorTestGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.disable = defaults.disable;
    	      this.name = defaults.name;
    	      this.sources = defaults.sources;
    	      this.testConfigurations = defaults.testConfigurations;
        }

        public Builder destinations(List<String> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder disable(@Nullable Boolean disable) {
            this.disable = disable;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder sources(List<String> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder testConfigurations(List<String> testConfigurations) {
            this.testConfigurations = Objects.requireNonNull(testConfigurations);
            return this;
        }
        public ConnectionMonitorTestGroupResponse build() {
            return new ConnectionMonitorTestGroupResponse(destinations, disable, name, sources, testConfigurations);
        }
    }
}
