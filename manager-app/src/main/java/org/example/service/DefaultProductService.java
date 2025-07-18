package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultProductService implements ProductService {

    private final ProductRepository productRepository;
}
